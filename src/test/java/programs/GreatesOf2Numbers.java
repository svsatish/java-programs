package programs;

import java.util.Scanner;

public class GreatesOf2Numbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = scanner.nextInt();
        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        if (x > y){
            System.out.print("The first number " + x + " is greater");
        } else {
            System.out.print("The second number " + y + " is greater");
        }

    }
}
