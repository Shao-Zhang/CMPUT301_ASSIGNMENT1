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

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public float getSuccessRate() {
        return trial.getSuccessRate(trial.getNumOfTrials(), trial.getSuccessNum());
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

