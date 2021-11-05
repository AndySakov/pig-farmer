package com.pig.farmer;

import java.util.Scanner;

public class Farmer {

    public static void main(String[] args) {
        boolean proceed = true;
        Feed apple = new Feed("Apple", 0);
        Feed potato = new Feed("Potato", 0);
        Pig pig1 = new Pig("Daniel", "Pink", false);
        Pig pig2 = new Pig("Samuel", "Red", false);
        Pig pig3 = new Pig("Caroline", "Brown", true);
        Scanner in = new Scanner(System.in);

        while(proceed) {
            System.out.println("Welcome to Pig Farmer Inventory #1");

            System.out.print("How many new bins of potatoes do you have?: ");
            int newPotato = in.nextInt();
            System.out.print("How many new bins of apples do you have?: ");
            int newApple = in.nextInt();
            potato.addFeed(newPotato);
            apple.addFeed(newApple);

            System.out.print("Would you like to feed the pigs? [Y/N]: ");
            String reply = in.next();
            if(reply.equalsIgnoreCase("Y")) {
                pig1.feed(apple);
                pig2.feed(apple);
                pig3.feed(apple);
            }

            System.out.print("Would you like to quit? [Y/N]: ");
            String reply2 = in.next();
            if(reply2.equalsIgnoreCase("Y")) {
                proceed = false;
            }
        }
    }
}
