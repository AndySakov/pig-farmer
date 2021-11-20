package com.pig.farmer;

import java.util.stream.IntStream;

public class PigCollection {
    private Pig[] pigs = new Pig[5];

    private boolean isFull() {
        for(Pig x : pigs ) {
            if(x == null) {
                return false;
            }
        }
        return true;
    }
    public void addPig(Pig pig) {
        if(isFull()){
            Pig[] copy = new Pig[pigs.length * 2];
            IntStream.range(0, pigs.length).forEach(i -> copy[i] = pigs[i]);
            pigs = copy;
            addPig(pig);
        } else {
            boolean done = false;
            int count = 0;
            while(!done) {
                if(pigs[count] == null){
                    pigs[count] = pig;
                    done = true;
                }
                count++;
            }
        }
    }

    public void feedPigs(FeedCollection feed) {
        if(feed.getNumberOfFullBins() < getPigCount()) {
            System.out.println("Not enough feed to feed all the pigs!");
        } else {
            for (Pig pig : pigs) {
                if(pig != null) {
                    pig.feed(feed.getNextFullBin());
                }
            }
            System.out.println("All pigs have been fed!");
        }
    }

    public int getPigCount() {
        int count = 0;
        for(Pig child : pigs) {
            if(child != null) {
                count++;
            }
        }
        return count;
    }

    public Pig[] getPigList() {
        return pigs;
    }
}
