package com.example.experimentbook;

import android.app.Application;

import java.util.ArrayList;

// Reference from Cristian https://stackoverflow.com/users/244296/cristian
// From Stackoverflow
// https://stackoverflow.com/posts/4878259/revisions
public class ExperimentBookApplication extends Application {
    transient private static ArrayList<Experiment> experiments;

    public static  ArrayList<Experiment> getExperiments(){
        if (experiments == null){
            experiments = new ArrayList<>();
        }
        return experiments;

    }

    public static Experiment getExperimentIndex(int position){
        if (experiments == null) {
            return null;
        } else {
            return experiments.get(position);
        }
    }

    public static void removeExperiment(int position){
        experiments.remove(position);
    }
}