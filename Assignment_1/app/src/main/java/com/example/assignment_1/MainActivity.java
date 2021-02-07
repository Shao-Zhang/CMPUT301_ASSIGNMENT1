package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView experimentListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Experiment> currentList = AssignmentApplication.getExperiments();

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String experimentName = extras.getString("name");
            String experimentDate = extras.getString("date");
            String experimentDescription = extras.getString("description");
            Experiment experiment = new Experiment(experimentName, experimentDate, experimentDescription);
            currentList.add(experiment);
        }

        experimentListView = findViewById(R.id.experimentList);
        ExperimentAdapterView adapterView = new ExperimentAdapterView(this, currentList);
        experimentListView.setAdapter(adapterView);
    }

    public void addButtonClicked(View view){
        Intent intent = new Intent(this, AddProductActivity.class);
        startActivity(intent);
    }


}