package programs;

import java.util.Scanner;

public class DivisibleBy5OrNot {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scanner.nextInt();

        if (num % 5 ==0){
            System.out.println("Entered number " + num + " is divisible by 5");
        } else {
            System.out.println("Entered number " + num + " is NOT divisible by 5");
        }
    }
}
