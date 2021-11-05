package com.pig.farmer;

public class Pig {
    private static int count = 0;
    private String color;
    private String name;
    private boolean isFemale;

    public static int getCount() {
        return count;
    }

    public Pig(String name, String color, boolean isFemale) {
        this.name = name;
        this.color = color;
        this.isFemale = isFemale;
    }

    public void feed(Feed food) {
        food.consume();
    }
}