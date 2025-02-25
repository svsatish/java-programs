package programs;

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation: ");
        String operation = scanner.next();

        switch (operation){
            case "add":
                System.out.println("The addition of "+ num1 + "+" + num2 + " is: " + (num1+num2));
                break;
            case "minus":
                System.out.println("The sub of "+ num1 + "-" + num2 + " is: " + (num1-num2));
                break;
            case "mul":
                System.out.println("The mul of "+ num1 + "*" + num2 + " is: " + (num1*num2));
                break;
            case "div":
                System.out.println("The div of "+ num1 + "/" + num2 + " is: " + (num1/num2));
                break;
            default:
                System.out.println("The operation is not valid");
                break;
        }
    }
}
