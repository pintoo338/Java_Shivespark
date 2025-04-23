package Assignment2;

public class Check_Leap_Year {
    public static void main(String[] args) {
        int year = 2024;
        String leap = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? "Leap Year" : "Not a Leap Year";
        System.out.println(year + " is a: " + leap);
    }
}
