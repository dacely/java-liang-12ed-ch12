package com.testing.ckp01;

public class Test1
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++)
        {
            int a = 5;
            int b = 0;
            int q = 0;
            int r = 0;

            try
            {
                b = i - 5;
                q = a / b;
                r = a % b;
                System.out.printf("%d = (%d)(%d) + %d\n", a, b, q, r);
            }
            catch (Exception e)
            {
                System.out.printf("error: %d / %d\n", a, b);
            }
        }
    }
}
