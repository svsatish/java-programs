package sdet;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class RemoveDuplicatesinArray {

    @Test
    public void test(){

        int[] arr = {1,2,2,6,5,5};

        HashSet<Integer> set = new HashSet<>();

        for(int num: arr){
            set.add(num);
        }

        System.out.println(set);
    }
}
