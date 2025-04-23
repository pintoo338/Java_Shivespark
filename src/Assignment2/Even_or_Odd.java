package Assignment2;

public class Even_or_Odd {
    public static void main(String[] args) {
        int num = 10;
        String evenOdd = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is: " + evenOdd);
    }
}
