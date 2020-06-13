package com.example.logist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_library);







        Button backButton = findViewById(R.id.library_back);
        backButton.setOnClickListener(v -> {
            finish();
        });
    }
}