package sdet;

import java.util.HashMap;

public class CountOccurancesOfCharacter {

    public static void main(String[] args){

        String str = "Automation";

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character c: str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+ 1);
        }

        System.out.println(map.get('t'));
    }
}
