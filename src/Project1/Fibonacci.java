package Project1;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.println("Fibonacci series up to 10 terms:");
        System.out.print(a + " " + b + " ");

        for (int i = 3; i <= 10; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
