import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        System.out.print("Enter the weight of the package: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a > 0 && a <= 1) {
            System.out.println("The shipping cost: 3.5");
        } else if (a <= 3 && a > 1) {
            System.out.println("The shipping cost: 5.5");
        } else if (a <= 10 && a >3) {
            System.out.println("The shipping cost: 8.5");
        } else if (a <= 20 && a > 10) {
            System.out.println("The shipping cost: 10.5");
        } else if (a > 20) {
            System.out.println("The package cannot be shipped.");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
