import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        System.out.print("Enter the length of edges of a triangle: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (c >= a + b || a >= c + b || b >= c + a) {
            System.out.println("The input is invalid.");
        } else {
            System.out.println("The perimeter: " + (a + b + c));
        }
    }
}
