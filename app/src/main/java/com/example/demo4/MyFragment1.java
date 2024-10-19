package com.example.demo4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MyFragment1 extends Fragment {

    private RecyclerView monthRecyclerView;
    private MonthAdapter monthAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the fragment layout
        View view = inflater.inflate(R.layout.fragment_my1, container, false);

        // Find views within the fragment layout
        monthRecyclerView = view.findViewById(R.id.month_recycler_view);

        // Initialize adapter and set it on RecyclerView
        monthAdapter = new MonthAdapter();
        monthRecyclerView.setAdapter(monthAdapter);
        monthRecyclerView.setLayoutManager(new LinearLayoutManager(getContext())); // Use getContext()

        return view;
    }
}