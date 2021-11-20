package com.pig.farmer;

import java.util.stream.IntStream;

public class FeedCollection {
    public static final int SIZE = 20;
    private Feed[] feeds = new Feed[SIZE];

    private boolean isFull() {
        for(Feed x : feeds ) {
            if(x == null) {
                return false;
            }
        }
        return true;
    }
    public void addFeed(Feed feed) {
        if(isFull()){
            Feed[] copy = new Feed[feeds.length * 2];
            IntStream.range(0, feeds.length).forEach(i -> copy[i] = feeds[i]);
            feeds = copy;
            addFeed(feed);
        } else {
            boolean done = false;
            int count = 0;
            while(!done) {
                if(feeds[count] == null){
                    feeds[count] = feed;
                    done = true;
                }
                count++;
            }
        }
    }

    public void setFeedNumber(int i, Feed feed) {
        try {
            feeds[i] = feed;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is no feed slot for number "+i);
        }
    }

    public void emptyFeedNumber(int id) {
        try {
            feeds[id].consume();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There is no feed slot for number "+id);
        }
    }

    public int getNumberOfFullBins() {
        int count = 0;
        for(Feed bin : feeds) {
            if (bin != null && bin.isFull()) {
                count += 1;
            }
        }
        return count;
    }

    public Feed getNextFullBin() {
        for(Feed bin : feeds) {
            if (bin != null) {
                return bin;
            }
        }
        return null;
    }
}
