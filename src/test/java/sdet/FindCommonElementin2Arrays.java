package sdet;

import java.util.HashSet;

public class FindCommonElementin2Arrays {

    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,2};
        int[] arr2 = {3,4,5,6};

        HashSet<Integer> set = new HashSet<>();

        for(int n: arr1){
            set.add(n);
        }

        for(int n: arr2){
            if (set.contains(n)){
                System.out.println(n + " is a common element");
            }
        }
    }
}
