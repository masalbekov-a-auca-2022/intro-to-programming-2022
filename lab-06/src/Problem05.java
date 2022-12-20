import java.util.Scanner;

public class Problem05 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("A = ");
        int num1 = scanner.nextInt();
        System.out.print("B = ");
        int num2 = scanner.nextInt();
        if (gcd(num1, num2) > 0) {
            System.out.println("GCD(" + num1 + ", " + num2 + ") = " + gcd(num1, num2));
        } else {
            System.out.println("GCD(" + num1 + ", " + num2 + ") is not defined.");
        }
    }

    static int gcd(int num1, int num2) {
        int gcd = 0;
        while (num2 > 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        gcd = num1;
        return gcd;
    }
}