package Assignment2;

public class Smallest_Three_numbers {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 5;
        int smallest = (a < b) ? (a < c) ? a : c : (b < c) ? b : c;
        System.out.println("Smallest number is: " + smallest);
    }
}
