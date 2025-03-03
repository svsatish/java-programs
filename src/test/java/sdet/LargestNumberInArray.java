package sdet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LargestNumberInArray {

    @Test
    public void test(){

        int[] arr = {3,9,4,2,8,6};
        int len = arr.length;
        Arrays.sort(arr);

        System.out.println("The largest element in array is: " + arr[len-1]);

    }
}
