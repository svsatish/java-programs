package sdet;

public class CheckIfStringIsEmpty {

    public static void main(String[] args){

        String str = "fgdf";

        boolean isEmpty = str.isEmpty();

        if (isEmpty)
            System.out.println("The string is empty");
        else
            System.out.println("The string is NOT empty");
    }
}
