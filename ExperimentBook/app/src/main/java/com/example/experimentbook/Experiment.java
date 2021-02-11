package com.example.experimentbook;

public class Experiment {
    private String name;
    private String date;
    private String description;
    private Trials trial = new Trials();

    public Experiment(String name, String date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public int getSuccessCount(){
        return trial.getSuccessNum();
    }

    public int getFailCount() {
        return trial.getFailNum();
    }

    public int getTotalCount() {
        return trial.getNumOfTrials();
    }

    public int getSuccessRate() {
        return trial.getSuccessRate();
    }

    public void addSuccessCount() {
        trial.addSuccessNum();
    }

    public void addFailCount() {
        trial.addFailNum();
    }

    public void addTrialCount() {
        trial.addTrialNum();
    }


}

