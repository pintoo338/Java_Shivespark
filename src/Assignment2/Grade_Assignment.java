package Assignment2;

public class Grade_Assignment {
    public static void main(String[] args) {
        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
        System.out.println("Grade: " + grade);

    }
}
