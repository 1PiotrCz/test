package com.company;

import java.util.Scanner;

/**
 * Created by Piotr on 2017-04-05.
 */
public class userInput {
    public static void main(String[] args) {
        Scanner scInput = new Scanner(System.in);

        System.out.println("Enter a floating point value ( example 2.3 ) : ");

        double value = scInput.nextDouble();

        System.out.println("Your value is : " + value);
    }
}
