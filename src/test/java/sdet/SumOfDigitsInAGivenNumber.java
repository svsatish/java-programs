package sdet;

import java.util.Scanner;

public class SumOfDigitsInAGivenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int sum=0;

        while (num != 0) {
            int digit = num%10;
            sum = sum+digit;
            num = num/10;
        }

        System.out.println("Sum of digits is: " + sum);
    }
}
