package com.example.assignment_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ExperimentAdapterView extends ArrayAdapter<Experiment> {

    private ArrayList<Experiment> experiments;
    private Context context;

    public ExperimentAdapterView(@NonNull Context context, @NonNull ArrayList<Experiment> experiments) {
        super(context, 0, experiments);
        this.context = context;
        this.experiments = experiments;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        // get experiment info
        String name = getItem(position).getName();
        String date = getItem(position).getDate();
        String description = getItem(position).getDescription();

        if(view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.adapter_view_layout, parent, false);
        }

        TextView experimentName = view.findViewById(R.id.expName);
        TextView experimentDate = view.findViewById(R.id.expDate);
        TextView experimentDescription = view.findViewById(R.id.expDescription);

        experimentName.setText(name);
        experimentDate.setText(date);
        experimentDescription.setText(description);


        return view;
    }
}
