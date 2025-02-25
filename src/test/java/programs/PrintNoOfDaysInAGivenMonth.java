package programs;

import java.util.Scanner;

public class PrintNoOfDaysInAGivenMonth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for month: ");
        int month = scanner.nextInt();

        // Solution1: using ladder if-else
//        if (month > 12 || month < 1) {
//            System.out.println("Number should be between 1 and 12");
//        } else if (month == 2) {
//            System.out.println("We have 28 days for this month");
//        } else if (month == 1 || month == 3 || month == 5 || month == 7 ||
//                month == 8 || month == 10 || month == 12) {
//            System.out.println("We have 31 days for this month");
//        } else {
//            System.out.println("We have 30 days for this month");
//        }

        // Solution2: using switch
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("We have 31 days for this month");
                break;
            case 4:
            case 9:
            case 6:
            case 11:
                System.out.println("We have 30 days for this month");
                break;
            case 2:
                System.out.println("We have 28/29 days for this month");
                break;
            default:
                System.out.println("Number should be between 1 and 12");
                break;

        }
    }
}
