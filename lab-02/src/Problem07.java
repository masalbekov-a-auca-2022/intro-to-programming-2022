import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        System.out.print("Enter the radius and length of a cylinder: ");
        Scanner num = new Scanner(System.in);
        double r = num.nextDouble();
        double l = num.nextDouble();
        double result = ((int)(10000.0 * r *r *Math.PI))/10000.0;
        System.out.println("The area is " +result);
        System.out.printf("The volume is %.1f", result * l);

    }
}
