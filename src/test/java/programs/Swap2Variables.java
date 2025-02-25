package programs;

import java.util.Scanner;

public class Swap2Variables {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter first number: ");
        int number2 = scanner.nextInt();

        System.out.println("Before swap, numbers are: " + number1 + "; " + number2);

        // Solution1: Using third variable
//        int temp;
//        temp = number1;
//        number1 = number2;
//        number2 = temp;

        // Solution2: Without using third variable

        number1 = (number1+number2);
        number2 = number1-number2;
        number1= number1-number2;

        System.out.println("After swap, numbers are: " + number1 + "; " + number2);
    }
}
