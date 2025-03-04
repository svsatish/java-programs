package sdet;

import java.util.Scanner;

public class SimpleLoginTest {

    public static void main(String[] args){

        String userName = "satish";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the UserName: ");
        String inputUserName = scanner.nextLine();

        System.out.print("Please enter the Password: ");
        String inputPassword = scanner.nextLine();
        scanner.close();

        if(inputUserName==userName && inputPassword==password)
            System.out.println("Login Successful");
        else
            System.out.println("Login Unsuccessful");
    }
}
