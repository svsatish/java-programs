package programs;

public class PrintFractions {

    public static void main(String[] args){

        // print 1/2+ 2/3+ 3/4+ 4/5+ 5/6

        double sum=0;

        for(double i=1; i<=5; i++){
            sum = sum + i/(i+1); // 1/2 + 2/3
        }
    System.out.println(sum);
    }
}
