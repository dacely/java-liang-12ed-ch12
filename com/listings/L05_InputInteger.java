package com.listings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class L05_InputInteger
{
    public static void main(String[] args)
    {
        int age = inputInt("Enter your age: ");
        double height = inputDouble("Enter your height: ");
        System.out.println("Your age is: " + age);
        System.out.printf("Your height is: %.2f\n", height);
    }

    public static int inputInt(String msg)
    {
        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean invalidInput = true;

        do
        {
            try
            {
                System.out.print(msg);
                num = input.nextInt();
                invalidInput = false;
            }
            catch (InputMismatchException ex)
            {
                System.out.println("Invalid input, an integer is required. Try again.");
                input.nextLine();
            }

        } while (invalidInput);

        return num;
    }

    public static double inputDouble(String msg)
    {
        Scanner input = new Scanner(System.in);
        boolean invalidInput = true;
        double num = 0.0;

        do
        {
            try
            {
                System.out.print(msg);
                String numStr = input.nextLine();
                numStr = numStr.replace(',','.').replace(" ", "");
                num = Double.parseDouble(numStr);
                invalidInput = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. A number is required. Try again.");
            }

        } while (invalidInput);

        return num;
    }
}
