package com.example.assignment_1;

public class Experiment {
    private String name;
    private String date;
    private String Rate;

    public Experiment(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setRate(String rate) {
        Rate = rate;
    }
}
