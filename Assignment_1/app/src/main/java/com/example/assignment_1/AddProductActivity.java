package com.example.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddProductActivity extends AppCompatActivity {

    EditText name = findViewById(R.id.experimentName);
    EditText date = findViewById(R.id.experimentDate);
    EditText description = findViewById(R.id.experimentDescription);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_experiment);

        Button addItemButton = findViewById(R.id.addFinalButton);
        addItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent returnToMain = new Intent(AddProductActivity.this, MainActivity.class);
                returnToMain.putExtra("name", )
            }
        });

    }
}