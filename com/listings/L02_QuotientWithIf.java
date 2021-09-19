package com.listings;

import java.util.Scanner;

public class L02_QuotientWithIf
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese dos números enteros: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n2 != 0)
            System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
        else
            System.out.println("El divisor no puede ser cero.");
    }
}
