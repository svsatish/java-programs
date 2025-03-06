package sdet;

import java.util.Arrays;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int[] arr1 = {1,4,3,5};

        int arr1Sum=0;

        for(int n: arr1){
            arr1Sum = arr1Sum + n;
        }

        int n = arr1.length+1;
       int expectedSum = n * (n+1)/2;

        System.out.println(expectedSum-arr1Sum);


    }
}
