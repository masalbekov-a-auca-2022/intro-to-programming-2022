import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            System.out.println(isPrime(a) ? 1 : 0);
        }

    }

    public static boolean isPrime(int a) {
        for (int j = 2; j < a; j++) {
            if (a % j == 0) return false;
        }
        return true;
    }
}
