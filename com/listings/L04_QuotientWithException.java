package com.listings;

import java.util.Scanner;

public class L04_QuotientWithException
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese dos números enteros: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        try
        {
            System.out.printf("%d / %d = %d", n1, n2, quotient(n1, n2));
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Excepción: " + ex.getMessage());
        }

        System.out.println("\nEl programa continua...");
    }

    public static int quotient(int n1, int n2)
    {
        if (n2 == 0)
            throw new ArithmeticException("El divisor no puede ser cero.");

        return n1 / n2;
    }
}
