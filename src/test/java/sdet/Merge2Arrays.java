package sdet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Merge2Arrays {

    @Test
    public void merge2ArraysTest(){

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int[] mergedArr = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length,arr2.length);

        Arrays.sort(
                mergedArr
        );

        System.out.println(Arrays.toString(mergedArr));
    }
}
