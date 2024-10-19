package com.example.demo4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.Month;
import java.util.List;


public class MonthAdapter extends RecyclerView.Adapter<MonthAdapter.ViewHolder> {

    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public MonthAdapter() {
        // No need for parameter here
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_my1, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.monthButtonView.setText(months[position]);
    }

    @Override
    public int getItemCount() {
        return months.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        Button monthButtonView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            monthButtonView = itemView.findViewById(R.id.month_button_view); // Use the correct id
        }
    }
}
