package com.pig.farmer;

public class Feed {

    public String name;
    private boolean isFull;
    private double weight;

    public void consume() {
        isFull = false;
    }

    public boolean isFull() {
        return isFull;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public Feed(String name, boolean isFull, double weight) {
        this.name = name;
        this.isFull = isFull;
        this.weight = weight;
    }
}
