package programs;

import java.util.Scanner;

public class FindMaxOf3Numbers {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int first = scanner.nextInt();

        System.out.print("Enter second no: ");
        int second = scanner.nextInt();

        System.out.print("Enter third no: ");
        int third = scanner.nextInt();

        if(first > second && first > third){
            System.out.println("First no. is greater");
        } else if (second > first && second > third) {
            System.out.println("Second no. is greater");
        } else {
            System.out.println("-------------------");
            System.out.println("Third no. is greater");
            System.out.println("-------------------");
        }
    }
}
