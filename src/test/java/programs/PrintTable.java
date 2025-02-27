package programs;

import java.util.Scanner;

public class PrintTable {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a no. : ");
        int number = scanner.nextInt();

        System.out.print("The table for number " + number + " is : ");

        for(int i=1; i<=10; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }

    }
}
