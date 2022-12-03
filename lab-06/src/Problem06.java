import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        System.out.println(sumDigits(a));

    }

    public static int sumDigits(long a) {
        int b = 0;
        while (a != 0) {
            b += a % 10;
            a /= 10;
        }
        return b;
    }
}
