package sdet;

import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args){

        // Prime number is divisible by 1 and itself

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime=true;

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i ==0 && num!=i){
                isPrime=false;
            }
        }

        if(isPrime) {
            System.out.println("The number " + num + " is prime ");
        } else {
            System.out.println("The number " + num + " is NOT prime ");
        }

    }
}
