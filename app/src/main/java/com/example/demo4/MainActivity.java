package com.example.demo4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private FrameLayout fragmentContainer;

    private Button button2;
    private FrameLayout fragmentContainer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        button1 = findViewById(R.id.button1);
        fragmentContainer = findViewById(R.id.fragmentContainer);

        // Set click listener for button 1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Replace FrameLayout with your fragment
                fragmentContainer.setVisibility(View.VISIBLE); // Show fragmentContainer
                fragmentContainer1.setVisibility(View.GONE);
                Fragment fragment = new MyFragment(); // Replace with your fragment class
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragmentContainer, fragment);
                transaction.commit();
            }
        });

        button2 = findViewById(R.id.button2);
        fragmentContainer1 = findViewById(R.id.fragmentContainer1);

        // Set click listener for button 2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Replace FrameLayout with your fragment
                fragmentContainer.setVisibility(View.GONE); // Show fragmentContainer
                fragmentContainer1.setVisibility(View.VISIBLE);

                Fragment fragment = new MyFragment1(); // Replace with your fragment class
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragmentContainer1, fragment);
                transaction.commit();
            }
        });


//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction =
//                fragmentManager.beginTransaction();
//        MyFragment myFragment = new MyFragment();
//        fragmentTransaction.add(R.id.fragmentContainer, myFragment);
//        fragmentTransaction.commit();
    }
}