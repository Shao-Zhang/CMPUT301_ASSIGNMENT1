package com.example.experimentbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddExperimentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_experiment);

        EditText name = findViewById(R.id.experimentName);
        EditText date = findViewById(R.id.experimentDate);
        EditText description = findViewById(R.id.experimentDescription);

        Button addItemButton = findViewById(R.id.addFinalButton);
        addItemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName = name.getText().toString();
                String fullDate = date.getText().toString();
                String fullDescription = description.getText().toString();

                // https://stackoverflow.com/questions/2091465/how-do-i-pass-data-between-activities-in-android-application
                Intent returnToMain = new Intent(AddExperimentActivity.this, MainActivity.class);
                returnToMain.putExtra("name", fullName);
                returnToMain.putExtra("date", fullDate);
                returnToMain.putExtra("description", fullDescription);
                startActivity(returnToMain);
            }
        });

    }
}