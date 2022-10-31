import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        System.out.print("month? ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month <= 2 || month == 12) {
            System.out.println("winter");
        } else if (month <= 5) {
            System.out.println("spring");
        } else if (month <= 8) {
            System.out.println("summer");
        } else {
            System.out.println("fall");
        }
    }
}
