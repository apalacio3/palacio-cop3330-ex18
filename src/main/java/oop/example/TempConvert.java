/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConvert
{
    public static void main(String[] args)
    {
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");

        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        double c;
        double f;
        String output = null;
        DecimalFormat d = new DecimalFormat("#.##");

        if(choice.equals("C") || choice.equals("c"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String temp = input.nextLine();
            f = Double.parseDouble(temp);
            c = (f - 32) * 5 / 9;

            output = "The temperature in Celsius is " + d.format(c) + ".";
        }
        else if(choice.equals("F") || choice.equals("f"))
        {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String temp = input.nextLine();
            c = Double.parseDouble(temp);
            f = (c * 5 / 90) + 32;

            output = "The temperature in Fahrenheit is " + d.format(f) + ".";
        }

        System.out.print(output);
    }
}