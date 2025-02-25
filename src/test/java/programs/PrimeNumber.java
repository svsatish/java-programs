package programs;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scanner.nextInt();

        boolean isPrime = num > 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(num + (isPrime ? " is a Prime Number" : " is NOT a Prime Number"));
    }
}

