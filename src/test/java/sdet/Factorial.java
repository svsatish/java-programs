package sdet;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){

        // Factorial = n * (n-1) * (n-2)...1

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number for Factorial: ");
        int num = scanner.nextInt();

        int factorial=1;
        for(int i=1; i<num; i++){
             factorial = i * (i+1);
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
