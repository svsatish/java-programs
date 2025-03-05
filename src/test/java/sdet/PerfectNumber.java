package sdet;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        //Perfect no - sum of its divisors is equal to its number except the number itself

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int sum=0;

        for(int i=1; i<=num/2; i++) {
            if(num%i==0){
                sum = sum+i;
            }

            }

        if(num==sum){
            System.out.println("This is a Perfect number");
        } else {
            System.out.println("This is not a perfect number");
        }




    }
}
