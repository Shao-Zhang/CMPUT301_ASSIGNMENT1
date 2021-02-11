package com.example.experimentbook;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ExperimentView extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experiment_view_layout);

        Experiment experiment;
        int experimentIndex = getIntent().getIntExtra("itemNum", 0);
        experiment = ExperimentBookApplication.getExperimentIndex(experimentIndex);

        setView(experiment);

        Button successButton = findViewById(R.id.experimentSuccessButton);
        Button failButton = findViewById(R.id.experimentFailButton);

        successButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                experiment.addSuccessCount();
                experiment.addTrialCount();
                finish();
                overridePendingTransition( 0, 0);
                startActivity(getIntent());
                overridePendingTransition( 0, 0);
            }
        });

        failButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                experiment.addFailCount();
                experiment.addTrialCount();
                // https://stackoverflow.com/questions/17488766/refresh-activity-without-re-opening-it
                finish();
                overridePendingTransition( 0, 0);
                startActivity(getIntent());
                overridePendingTransition( 0, 0);

            }
        });

    }

    private void setView( Experiment experiment){
        TextView nameView = findViewById(R.id.experimentViewName);
        TextView successView = findViewById(R.id.experimentViewSuccess);
        TextView failView = findViewById(R.id.experimentViewFail);
        TextView descriptionView = findViewById(R.id.descriptionView);
        TextView successRateView = findViewById(R.id.successRateView);
        TextView totalTrialView = findViewById(R.id.totalTrialView);

        String success = "Success/True: " + experiment.getSuccessCount();
        String fail = "Fail/False: " + experiment.getFailCount();
        String rate = "Success Rate: " + experiment.getSuccessRate() + "%";
        String totalTrial = "Total Trials: " + experiment.getTotalCount();
        String description = "DESCRIPTION: " + experiment.getDescription();

        nameView.setText(experiment.getName());
        successView.setText(success);
        failView.setText(fail);
        descriptionView.setText(description);
        successRateView.setText(rate);
        totalTrialView.setText(totalTrial);
    }
}
