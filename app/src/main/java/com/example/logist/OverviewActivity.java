package com.example.logist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class OverviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory_overview);

        Button newEntry = findViewById(R.id.new_entry);
        newEntry.setOnClickListener(v -> {
            //go to dropdown of existing recipes, or give option to build a new one
        });

        Button recLib = findViewById(R.id.rec_list);
        recLib.setOnClickListener(v -> {
            //go to recipe library to edit or view
        });

        Button backButton = findViewById(R.id.over_back);
        backButton.setOnClickListener(v -> {
            finish();
        });


    }
}
