package com.listings;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class L13_WriteData
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("scores.txt");

        if (file.exists())
        {
            System.out.println("File already exists");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);
        output.printf("John T Smith %d\n", 90);
        output.printf("Eric K Jones %d\n", 85);
        output.close();
    }
}
