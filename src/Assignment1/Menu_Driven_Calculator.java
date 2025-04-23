package Assignment1;

import java.util.Scanner;

public class Menu_Driven_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Menu: \n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: System.out.println("Sum = " + (a + b)); break;
            case 2: System.out.println("Difference = " + (a - b)); break;
            case 3: System.out.println("Product = " + (a * b)); break;
            case 4:
                if (b != 0)
                    System.out.println("Quotient = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
                break;
            default: System.out.println("Invalid choice");
        }
    }
}
