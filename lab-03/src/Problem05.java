import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        System.out.print("Number of points? ");
        Scanner scanner = new Scanner(System.in);
        String g;
        int grade = scanner.nextInt();
        if (grade >= 90) {
            g = "A";
        } else if (grade >= 80) {
            g = "B";
        } else if (grade >= 70) {
            g = "C";
        } else if (grade >= 60) {
            g = "D";
        } else {
            g = "F";
        }
        if (grade < 100) {
            System.out.println("Grade: " + g);
        } else {
            System.out.println(grade + " is not in the permitted range.");
        }
    }
}