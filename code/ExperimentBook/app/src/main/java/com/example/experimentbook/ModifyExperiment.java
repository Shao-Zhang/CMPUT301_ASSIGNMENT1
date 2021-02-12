package com.example.experimentbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ModifyExperiment extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modify_experiment);

        int index = getIntent().getIntExtra("experimentIndex",0);
        Experiment experiment = ExperimentBookApplication.getExperimentIndex(index);

        TextView name = findViewById(R.id.modifyName);
        TextView date = findViewById(R.id.modifyDate);
        TextView description = findViewById(R.id.modifyDescription);

        name.setText(experiment.getName());
        date.setText(experiment.getDate());
        description.setText(experiment.getDescription());

        Button saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newName = name.getText().toString();
                String newDate = date.getText().toString();
                String newDescription = description.getText().toString();
                experiment.setName(newName);
                experiment.setDate(newDate);
                experiment.setDescription(newDescription);
                Intent returnToMain = new Intent(ModifyExperiment.this, MainActivity.class);
                startActivity(returnToMain);
            }
        });

        Button deleteButton = findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExperimentBookApplication.removeExperiment(index);
                Intent returnToMain = new Intent(ModifyExperiment.this, MainActivity.class);
                startActivity(returnToMain);
            }
        });


    }

}
