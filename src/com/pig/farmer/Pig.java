package com.pig.farmer;

public class Pig {
    private String color;
    private String PigID;
    private String name;
    private boolean isFemale;
    private boolean isFed = false;


    public Pig(String PigID, String name, String color, boolean isFemale) {
        this.PigID = PigID;
        this.name = name;
        this.color = color;
        this.isFemale = isFemale;
    }

    public void feed(Feed food) {
        food.consume();
        isFed = true;
    }
}