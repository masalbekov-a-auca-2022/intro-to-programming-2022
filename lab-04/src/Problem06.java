import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        System.out.print("Enter a point with two coordinates: ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextInt();
        double y = scanner.nextInt();
        if (x <= 10.0/2 && y <=5.0/2){
            System.out.printf("Point (%.1f, %.1f) is in the rectangle%n", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle%n", x, y);
        }
    }
}
