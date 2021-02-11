package com.example.experimentbook;

public class Trials {
    private int successNum;
    private int failNum;
    private int numOfTrials;
    private float successRate;

    public Trials() {
        successNum = 0;
        failNum = 0;
        numOfTrials = 0;
        successRate = getSuccessRate(numOfTrials, successNum);
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

    public float getSuccessRate(int numOfTrials, int successNum) {
        if (numOfTrials == 0){
            successRate = 0;
        } else {
            successRate = ((float) successNum/numOfTrials) * 100;

        }
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
}
