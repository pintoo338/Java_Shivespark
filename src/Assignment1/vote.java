package Assignment1;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        switch(age >= 18 ? 1 : 0) {
            case 1: System.out.println("Eligible to vote"); break;
            case 0: System.out.println("Not eligible to vote"); break;
        }
    }
}
