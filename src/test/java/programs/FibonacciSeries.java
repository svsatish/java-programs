package programs;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args){

        // Fibonacci - sum of 2 numbers that precedes it
        // 0,1,1,2,3,5,8,13...

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number until the fibonacci sequence that you want to generate: ");
        int num = scanner.nextInt();

        int num1=0, num2=1;
        System.out.print("Fibonacci series: "+ num1 + " " + + num2);

        for(int i=2; i<num; i++){
            int num3 = num1+num2;
            System.out.print(" "+ num3); //1
            num1 = num2;
            num2 = num3;

        }
    }
}
