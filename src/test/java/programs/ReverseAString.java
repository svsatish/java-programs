package programs;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String str = scanner.next();

        // Solution1: StringBuilder
//        StringBuilder sb = new StringBuilder(str);
//
//        System.out.println("The reverse of entered string: " + str + " is " + sb.reverse());

        // Solution2 : using for loop
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
