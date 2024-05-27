package sdet_programs;

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args){

        /* Logic:
         1. using temp variable
         2. using + & -
         3. using * & / but no number should be zero
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = sc.nextInt();
        System.out.println("Please enter second number: ");
        int b = sc.nextInt();
        swapTwoNumbers(a,b);
    }

    public static void swapTwoNumbers(int a, int b){

        System.out.println("Before Swapping, values are :" + a + " & " + b);

        b = a+b-(a=b);

        /* int temp;
        temp = a;
        a = b;
        b = temp; */

        System.out.println("Before Swapping, values are :" + a + " & " + b);

    }
}
