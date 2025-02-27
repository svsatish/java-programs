package programs;

public class PrintSumMinus {

    public static void main(String[] args){

        // print 1+2-3+4+5-6+7+8-9

        int sum=0;

        for(int i=1; i<10; i++){
            if(i%3!=0){
                sum=sum+i; // 1+2+4+5+7+8=27
            }
            if(i%3==0){
                sum=sum-i; //-3-6-9=18
            }
        }
        System.out.println(sum); //9
    }
}
