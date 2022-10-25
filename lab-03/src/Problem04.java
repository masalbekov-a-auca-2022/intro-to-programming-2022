import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Year? ");
        int year = num.nextInt();
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }
    }
}
