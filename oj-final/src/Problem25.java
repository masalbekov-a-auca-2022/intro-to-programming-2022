import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int k = scanner.nextInt();
            for (int j = 0; j < k; j++) {
                int a = scanner.nextInt();
                sum += a;
            }
            System.out.println(sum - (k - 1));
        }
    }
}
