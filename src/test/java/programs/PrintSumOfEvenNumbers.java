package programs;

public class PrintSumOfEvenNumbers {

    public static void main(String[] args){

        int sum=0;
        for(int i=0; i<=10; i++){
            if(i%2==0){
                sum = sum+i; //2+4+6+8+10=30
            }
        }
        System.out.println(sum);
    }
}
