package Project1;

import java.util.Scanner;

public class Gender_using_switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().toUpperCase().charAt(0);

        switch(gender) {
            case 'M': System.out.println("Male"); break;
            case 'F': System.out.println("Female"); break;
            default: System.out.println("Invalid input");
        }
    }
}
