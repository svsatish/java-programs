package sdet;

import java.util.Scanner;

public class CountVowelsConsonants {

    public static void main(String[] args){

        // vowels - a,e,i,o,u ; consonants - others

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String str = scanner.next();

        int vowel=0;
        int constant=0;
        int length = str.length();

        for(int i=0; i<length; i++){
            char chr = str.charAt(i);
            if (chr=='a' || chr=='e' || chr=='i' || chr=='o' || chr=='u'){
                vowel++;
            } else {
                constant++;
            }
        }
        System.out.println("The number of vowels are: " + vowel + " and constants are: " + constant);
    }
}
