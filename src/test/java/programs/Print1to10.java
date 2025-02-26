package programs;

public class Print1to10 {

    public static void main(String[] args){

//        // Solution1: using for loop
//        for(int i=1; i<=10; i++){
//            System.out.println(i);
//        }
//
//        // Solution2: using while loop
//        int i=1;
//        while (i<=10){
//            System.out.println(i);
//            i++;
//        }

        // Solution3: do-while
        int x=1;
        do{
            System.out.println(x);
            x++;
        }while (x<=10);
    }
}
