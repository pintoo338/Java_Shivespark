package Assignment2;

public class Positive_Negative_zero {
    public static void main(String[] args) {
        int number = 0;
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        System.out.println("The number is: " + result);
    }
}
