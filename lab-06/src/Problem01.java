import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your coordinate: ");
        int a = scanner.nextInt();
        System.out.print("Coordinate of 1st point: ");
        int b = scanner.nextInt();
        System.out.print("Coordinate of 2nd point: ");
        int c = scanner.nextInt();
        int d1 = abs(b - a);
        int d2 = abs(c - a);

        if (d1 < d2) {
            System.out.println("1st is closer. distance is " + d1);
        } else if (d2 < d1) {
            System.out.println("2nd is closer. Distance is " + d2);
        } else {
            System.out.println("distance is the same: " + d1);
        }

    }

    static int abs(int n) {
        if (n < 0) {
            n = -n;
        }
        return n;
    }
}