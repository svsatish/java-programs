package sdet;

import java.util.Scanner;

public class CheckIfLeapYear {

    public static void main(String[] args){

        // Leap year - divisible for 4 years but not 100 years

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a year: ");
        int num = scanner.nextInt();

        if ((num%4==0 && num%100!=0) || (num%400==0))
            System.out.println(num + " is leap year");
        else
            System.out.println(num + " is NOT leap year");
    }
}
