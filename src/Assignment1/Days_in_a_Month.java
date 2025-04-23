import java.util.Scanner;

public class Days_in_a_Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        // Check for leap year if February is selected
        int year = 0;
        if (month == 2) {
            System.out.print("Enter year: ");
            year = sc.nextInt();
        }

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                // Check if the year is a leap year
                boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (isLeap) {
                    System.out.println("29 days (Leap Year)");
                } else {
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}

