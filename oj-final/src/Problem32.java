import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int c = 0;
            a = Math.abs(a);
            do {
                a /= 10;
                c++;
            } while (a != 0);
            System.out.println(c);
        }
    }
}
