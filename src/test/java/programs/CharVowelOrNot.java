package programs;

import java.util.Scanner;

public class CharVowelOrNot {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a character: ");
        char character = scanner.next().charAt(0);

        if (character=='a' || character=='e' || character=='i' ||
        character=='o' || character=='u'){
            System.out.println("Entered character is Vowel");
        } else {
            System.out.println("Entered character is NOT a Vowel");
        }
    }

}
