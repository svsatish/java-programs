package sdet;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        int sum=0;

        for(int i=0; i<=num; i++){
            sum = sum + i;
        }

        // n  * (n+1) / 2 = 10*11/2 = 55

        System.out.println("The sum of first " +  num + " is: " + sum);
    }
}
