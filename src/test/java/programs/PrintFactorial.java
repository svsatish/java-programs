package programs;

import java.util.Scanner;

public class PrintFactorial {

    public static void main(String[] args){

        // factorial = n * (n-1) * ...

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();

        int factorial=1;
        for(int i=1; i<=num; i++){
            factorial = factorial * i; // 5*4*3*2
        }
        System.out.println(factorial);
    }
}
