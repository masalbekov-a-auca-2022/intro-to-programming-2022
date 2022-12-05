import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int counter = 0;
        for (int i = a; i <= b; i++) {
            int dv = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) dv++;
            }
            if (dv == 4) counter++;

        }
        System.out.printf("The number of RSA numbers between %d and %d is %d%n", a, b, counter);
    }
}
