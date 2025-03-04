package sdet;

import java.util.HashMap;
import java.util.Scanner;

public class MaxOccCharInString {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a String: ");
        String str = scanner.nextLine();
        scanner.close();

        HashMap<Character, Integer> map = new HashMap();

        // Count the frequency of each char
        for(char ch: str.toCharArray()){
            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        int maxCount = 0;
        char maxChar = ' ';

        for (char ch : map.keySet()) {
            if (map.get(ch) > maxCount) {
                maxCount = map.get(ch);
                maxChar = ch;
            }
        }

        System.out.println(maxChar);
    }
}
