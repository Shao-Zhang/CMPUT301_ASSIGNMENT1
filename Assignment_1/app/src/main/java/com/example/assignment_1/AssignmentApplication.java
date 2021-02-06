package com.example.assignment_1;

import android.app.Application;

import java.util.ArrayList;

public class AssignmentApplication extends Application {
    transient private static ArrayList<Experiment> experiments;

    public static  ArrayList<Experiment> getExperiments(){
        if (experiments == null){
            experiments = new ArrayList<>();
        }
        return experiments;

    }
}
