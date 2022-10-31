import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        System.out.print("Enter a point with two coordinates: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        if (Math.sqrt(y*y + x*x) <=10){
            System.out.printf("Point (%.1f, %.1f) is in the circle%n", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle%n", x, y);
        }
    }
}
