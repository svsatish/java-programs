package sdet;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindFirstNonRepeatedCharacterinString {

    public static void main(String[] args){

        String str = "i am writing a program now";

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        // get the frequency of occurances of each character
        for(Character c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        for(Character c : str.toCharArray()){
            if (map.get(c) == 1){
                System.out.println(c);
                break;
            }
        }
    }
}
