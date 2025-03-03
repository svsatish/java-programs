package sdet;

import java.util.Scanner;

public class CheckArmstrong {

    // Armstrong = 3 digit number where number is equal to sum of cubes of its digits

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int noOfDigits = String.valueOf(num).length();

        int sum=0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            sum += Math.pow(digit, noOfDigits); // Raise to power of digit count and add
            num /= 10; // Remove last digit
        }

        if (sum==originalNum){
            System.out.println("It is Anagram");
        } else {
            System.out.println("It is NOT Anagram");
        }


    }
}
