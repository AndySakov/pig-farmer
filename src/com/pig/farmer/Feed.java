package com.pig.farmer;

public class Feed {

    private static int feedAmount = 0;

    public String name;

    public static int getAmount() {
        return feedAmount;
    }

    public void consume() {
        if(feedAmount == 0) {
            System.out.println("Can't feed animal because feed is equal to 0");
        } else {
            feedAmount -= 1;
        }
    }

    public void addFeed(int bins) {
        feedAmount += bins;
    }

    public Feed(String name, int bins) {
        this.name = name;
        this.addFeed(bins);
    }
}
