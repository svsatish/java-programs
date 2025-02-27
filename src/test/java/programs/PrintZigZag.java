package programs;

public class PrintZigZag {

    public static void main(String[] args){

        // Print 1 10 2 9 3 8 4 7 5 6

        int j = 10;
        for(int i=1; i<=5; i++){ // 1
            System.out.print(i + " "); // 1
            System.out.print(j + " "); // 10
            j--;
        }

    }
}
