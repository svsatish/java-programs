package programs;

public class CheckForPalindrome {

    public static void main(String[] args){

        String str = "oto";

        StringBuilder sb = new StringBuilder(str);
        String reverse = sb.reverse().toString();

        if(str.equals(reverse)){
            System.out.print("The entered string is Palindrome");
        } else{
            System.out.print("The entered string is NOT Palindrome");
        }
    }
}
