package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 John Page
 */

import java.util.Scanner;

public class SimpleMath
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in); //define scan

        // Get input for the first number and scan
        System.out.print( "What is the first number? " );
        String first = input.nextLine();
        int inputFirst = Integer.parseInt(first);

        // Get input for second number and scan
        System.out.print("What is the second number? ");
        String second = input.nextLine();
        int inputSecond = Integer.parseInt(second);

        // define addition, subtraction, multiplication, and division
        int sum = inputFirst + inputSecond;
        int dif = inputFirst - inputSecond;
        int mult = inputFirst*inputSecond;
        int div = inputFirst/inputSecond;

        //Calculate
        System.out.println(inputFirst+" + "+inputSecond+" = "+sum+"\n"+inputFirst+" - "+inputSecond+" = "+dif+"\n"+inputFirst+" * "+inputSecond+" = "+mult+"\n"+inputFirst+" / "+inputSecond+" = "+div);


    }
}
