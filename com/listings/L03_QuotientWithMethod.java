package com.listings;

import java.util.Scanner;

public class L03_QuotientWithMethod
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese dos números enteros: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.printf("%d / %d = %d", n1, n2, quotient(n1, n2));
    }

    public static int quotient(int n1, int n2)
    {
        if (n2 == 0)
        {
            System.out.println("El divisor no puede ser cero.");
            System.exit(1);
        }
        return n1 / n2;
    }
}
