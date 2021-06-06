package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("How many people? ");
        int numPeople = newScan.nextInt();

        System.out.print("How many pizzas do you have? ");
        int numPizzas = newScan.nextInt();

        System.out.print("How many slices per pizza? ");
        int numSlices = newScan.nextInt();

        //Calculations
        int div = (numPizzas * numSlices)/numPeople;
        int rem = (numPizzas * numSlices)%numPeople;

        //Output
        System.out.println(numPeople + " people with " + numPizzas + " pizzas (" + (numPizzas * numSlices) + " slices)");
        System.out.println("Each person gets " +  div + " slices of pizza.");
        System.out.println("There are " + rem + " leftover pizza slices.");
    }

}
