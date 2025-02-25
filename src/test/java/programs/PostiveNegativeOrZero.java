package programs;

import java.util.Scanner;

public class PostiveNegativeOrZero {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();

        if(number < 0) {
            System.out.println("The entered number " + number + " is Negative");
        } else if (number > 0) {
            System.out.println("The entered number " + number + " is Positive");
        } else {
            System.out.println("The entered number " + number + " is Zero");
        }
    }

}
