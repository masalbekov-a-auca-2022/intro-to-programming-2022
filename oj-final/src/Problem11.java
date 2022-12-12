import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double min = 0;
        for (int i = 0; i < n; i++) {
            double a = scanner.nextDouble();
            if (a < min) {
                min = a;
            }
        }
        System.out.println(min);
    }
}
