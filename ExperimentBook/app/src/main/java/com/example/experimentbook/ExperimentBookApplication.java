package com.example.experimentbook;

import android.app.Application;

import java.util.ArrayList;

public class ExperimentBookApplication extends Application {
    transient private static ArrayList<Experiment> experiments;

    public static  ArrayList<Experiment> getExperiments(){
        if (experiments == null){
            experiments = new ArrayList<>();
        }
        return experiments;

    }
}