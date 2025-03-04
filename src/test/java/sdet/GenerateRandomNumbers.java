package sdet;

import java.util.Random;

public class GenerateRandomNumbers {

    public static void main(String[] args){

        Random ran = new Random();
        System.out.println(ran.nextInt(0, 10));

    }
}
