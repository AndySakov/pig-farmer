package com.pig.farmer;

import java.util.Scanner;

public class Farmer {
    public static Scanner scan = new Scanner(System.in);
    public static FeedCollection feeds = new FeedCollection();
    public static PigCollection piggies = new PigCollection();

    public static void addPig() {
        System.out.print("Input Pig ID: ");
        String pid = scan.next();
        System.out.print("Input Pig Name: ");
        String name = scan.next();
        System.out.print("Input Pig Color: ");
        String color = scan.next();
        System.out.print("Is this pig female[1 for yes, 0 for no]: ");
        String re = scan.next();
        try {
            boolean isFemale = Integer.parseInt(re) == 1;
            piggies.addPig(new Pig(pid, name, color, isFemale));
            System.out.println("New Pig added successfully!\n");
        } catch (NumberFormatException ex) {
            System.out.println(re + " is not a valid option here!\nTry Again!");
        }
    }
    public static void addFeed() {
        System.out.print("Input Feed Name: ");
        String name = scan.next();
        System.out.print("Is this feed full[1 for yes, 0 for no]: ");
        String re = scan.next();
        try {
            boolean isFull = Integer.parseInt(re) == 1;
            System.out.print("Input Feed Weight: ");
            double weight = scan.nextDouble();
            feeds.addFeed(new Feed(name, isFull, weight));
            System.out.println("New Feed added successfully!\n");
        } catch (NumberFormatException ex) {
            System.out.println(re + " is not a valid option here!\nTry Again!");
        }
    }
    public static void feedPigs() {
        piggies.feedPigs(feeds);
        System.out.println();
    }
    public static void report() {
        System.out.println("This operation is not supported at this time!\n");
    }


    public static void main(String[] args) {
        System.out.println("Welcome to Pig Farmer 2");
        boolean run = true;
        while (run) {
            System.out.println("Please choose one of the following actions...");
            System.out.println("\t1. Add Pig");
            System.out.println("\t2. Add Feed");
            System.out.println("\t3. Feed Pigs");
            System.out.println("\t4. Report");
            System.out.println("\t5. Exit");
            System.out.print("Choose an option: ");
            int reply = scan.nextInt();

            switch (reply) {
                case 1 -> addPig();
                case 2 -> addFeed();
                case 3 -> feedPigs();
                case 4 -> report();
                case 5 -> {
                    System.out.println("Thanks for using Pig Farmer 2\nGoodbye!");
                    run = false;
                }
                default -> System.err.println("Invalid Option\nTry again!");
            }
        }
    }
}
