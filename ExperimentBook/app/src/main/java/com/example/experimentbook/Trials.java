package com.example.experimentbook;

public class Trials {
    private int successNum;
    private int failNum;
    private int numOfTrials;
    private int successRate;

    public Trials() {
        successNum = 0;
        failNum = 0;
        numOfTrials = 0;
        successRate = setSuccessRate(successNum, numOfTrials);
    }

    public int getSuccessNum() {
        return successNum;
    }

    public int getFailNum() {
        return failNum;
    }

    public int getNumOfTrials() {
        return numOfTrials;
    }

    public int getSuccessRate() {
        return successRate;
    }

    public void addSuccessNum() {
        successNum = successNum + 1;
    }

    public void addFailNum() {
        failNum = failNum + 1;
    }

    public void addTrialNum() {
        numOfTrials = numOfTrials + 1;
    }

    private int setSuccessRate(int successNum, int numOfTrials) {
        if (numOfTrials == 0){
            return 0;
        } else {
            return successNum / numOfTrials;
        }
    }
}
