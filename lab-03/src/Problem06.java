import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = num.nextDouble();
        double b = num.nextDouble();
        double c = num.nextDouble();
        double dis = Math.sqrt(b * b - 4 * a * c);
        if (dis > 0) {
            double root1 = (-b + dis) / 2 * a;
            double root2 = (-b - dis) / 2 * a;
            System.out.printf("The equation has two roots %.4f and %.4f\n", root1, root2);
        } else if (dis == 0) {
            double root = -b / 2 * a;
            System.out.printf("The equation has one root %.4f\n", root);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
