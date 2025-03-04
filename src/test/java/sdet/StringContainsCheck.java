package sdet;

import java.util.Scanner;

public class StringContainsCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.next();

        System.out.print("Please enter the second string to check if this is in - " );
        String str2 = scanner.next();
        scanner.close();

        boolean check = str.contains(str2);

        if (check) {
            System.out.println(str2 + " is contained in " + str);
        } else
            System.out.println(str2 + " is NOT contained in " + str);
    }
}
