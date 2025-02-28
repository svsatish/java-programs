package programs;

public class PrintFractionMultiplication {

    //TODO: Look into this question later
    public static void main(String[] args){

        // print = 1^2 + 2^2 + 3^2 + 4^2 + 5^2

        int sum=0;
        for(int i=1; 1<=5; i++){
            sum = i^2 + sum;
        }
    }
}
