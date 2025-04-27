import java.util.Scanner;

public class ProgramCollection {
    private Scanner scanner;

    public ProgramCollection() {
        scanner = new Scanner(System.in);
    }

    // 1. Days in a Month
    public void daysInMonth() {
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int days = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> -1;
        };

        if (days != -1) {
            System.out.println("Number of days: " + days);
        } else {
            System.out.println("Invalid month!");
        }
    }

    // 2. Even or Odd
    public void evenOrOdd() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd"));
    }

    // 3. Factorial
    public void factorial() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
    }

    // 4. Fibonacci
    public void fibonacci() {
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    // 5. Gender using switch
    public void genderUsingSwitch() {
        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);
        switch (Character.toUpperCase(gender)) {
            case 'M' -> System.out.println("Male");
            case 'F' -> System.out.println("Female");
            default -> System.out.println("Invalid input");
        }
    }

    // 6. Grade Remark
    public void gradeRemark() {
        System.out.print("Enter grade (A/B/C/D/F): ");
        char grade = scanner.next().charAt(0);
        switch (Character.toUpperCase(grade)) {
            case 'A' -> System.out.println("Excellent!");
            case 'B' -> System.out.println("Good!");
            case 'C' -> System.out.println("Satisfactory");
            case 'D' -> System.out.println("Needs Improvement");
            case 'F' -> System.out.println("Failed");
            default -> System.out.println("Invalid grade");
        }
    }

    // 7. HCF (Highest Common Factor)
    public void hcf() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("HCF: " + num1);
    }

    // 8. Menu Driven Calculator
    public void menuDrivenCalculator() {
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter choice (1-4): ");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1 -> System.out.println("Result: " + (num1 + num2));
            case 2 -> System.out.println("Result: " + (num1 - num2));
            case 3 -> System.out.println("Result: " + (num1 * num2));
            case 4 -> {
                if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                else System.out.println("Cannot divide by zero!");
            }
            default -> System.out.println("Invalid choice!");
        }
    }

    // 9. Natural Numbers
    public void naturalNumbers() {
        System.out.print("Enter limit: ");
        int n = scanner.nextInt();
        System.out.print("Natural numbers up to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // 10. Palindrome
    public void palindrome() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int original = num, reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original + (original == reversed ? " is" : " is not") + " a palindrome");
    }

    // 11. Power
    public void power() {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        System.out.println("Result: " + Math.pow(base, exponent));
    }

    // 12. Prime Check
    public void primeCheck() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + (isPrime ? " is" : " is not") + " prime");
    }

    // 13. Reverse Number
    public void reverseNumber() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    // 14. Simple Calculator
    public void simpleCalculator() {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> System.out.println("Result: " + (num1 + num2));
            case '-' -> System.out.println("Result: " + (num1 - num2));
            case '*' -> System.out.println("Result: " + (num1 * num2));
            case '/' -> {
                if (num2 != 0) System.out.println("Result: " + (num1 / num2));
                else System.out.println("Cannot divide by zero!");
            }
            default -> System.out.println("Invalid operator!");
        }
    }

    // 15. Multiplication Table
    public void multiplicationTable() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // 16. Vote Eligibility
    public void voteEligibility() {
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.println(age >= 18 ? "Eligible to vote" : "Not eligible to vote");
    }

    // 17. Vowel or Consonant
    public void vowelOrConsonant() {
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if ("aeiou".indexOf(ch) != -1) {
            System.out.println("Vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid input");
        }
    }

    // 18. Weekday using switch
    public void weekdayUsingSwitch() {
        System.out.print("Enter day number (1-7): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number!");
        }
    }

    // 19. Absolute Value
    public void absoluteValue() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Absolute value: " + Math.abs(num));
    }

    // 20. Check Leap Year
    public void checkLeapYear() {
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (isLeap ? " is" : " is not") + " a leap year");
    }

    // 21. Grade Assignment
    public void gradeAssignment() {
        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();
        String grade;
        if (marks >= 90) grade = "A";
        else if (marks >= 80) grade = "B";
        else if (marks >= 70) grade = "C";
        else if (marks >= 60) grade = "D";
        else grade = "F";
        System.out.println("Grade: " + grade);
    }

    // 22. Greater Number
    public void greaterNumber() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Greater number: " + Math.max(num1, num2));
    }

    // 23. Positive Negative Zero
    public void checkPositiveNegativeZero() {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }

    // 24. Smallest Three Numbers
    public void smallestThreeNumbers() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        int smallest = Math.min(Math.min(num1, num2), num3);
        System.out.println("Smallest number: " + smallest);
    }

    public static void main(String[] args) {
        ProgramCollection programs = new ProgramCollection();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nAvailable Programs:");
            System.out.println("1. Days in a Month");
            System.out.println("2. Even or Odd");
            System.out.println("3. Factorial");
            System.out.println("4. Fibonacci");
            System.out.println("5. Gender Check");
            System.out.println("6. Grade Remark");
            System.out.println("7. HCF Calculation");
            System.out.println("8. Menu Driven Calculator");
            System.out.println("9. Natural Numbers");
            System.out.println("10. Palindrome Check");
            System.out.println("11. Power Calculation");
            System.out.println("12. Prime Check");
            System.out.println("13. Reverse Number");
            System.out.println("14. Simple Calculator");
            System.out.println("15. Multiplication Table");
            System.out.println("16. Vote Eligibility");
            System.out.println("17. Vowel or Consonant");
            System.out.println("18. Weekday Check");
            System.out.println("19. Absolute Value");
            System.out.println("20. Check Leap Year");
            System.out.println("21. Grade Assignment");
            System.out.println("22. Greater Number");
            System.out.println("23. Positive Negative Zero");
            System.out.println("24. Smallest Three Numbers");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice (0-24): ");
            int choice = sc.nextInt();

            if (choice == 0) break;

            switch (choice) {
                case 1 -> programs.daysInMonth();
                case 2 -> programs.evenOrOdd();
                case 3 -> programs.factorial();
                case 4 -> programs.fibonacci();
                case 5 -> programs.genderUsingSwitch();
                case 6 -> programs.gradeRemark();
                case 7 -> programs.hcf();
                case 8 -> programs.menuDrivenCalculator();
                case 9 -> programs.naturalNumbers();
                case 10 -> programs.palindrome();
                case 11 -> programs.power();
                case 12 -> programs.primeCheck();
                case 13 -> programs.reverseNumber();
                case 14 -> programs.simpleCalculator();
                case 15 -> programs.multiplicationTable();
                case 16 -> programs.voteEligibility();
                case 17 -> programs.vowelOrConsonant();
                case 18 -> programs.weekdayUsingSwitch();
                case 19 -> programs.absoluteValue();
                case 20 -> programs.checkLeapYear();
                case 21 -> programs.gradeAssignment();
                case 22 -> programs.greaterNumber();
                case 23 -> programs.checkPositiveNegativeZero();
                case 24 -> programs.smallestThreeNumbers();
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }

        System.out.println("Thank you for using the program!");
        sc.close();
        programs.scanner.close();
    }
}