import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double hp = scanner.nextDouble();
            int h = scanner.nextInt();
            String tax = scanner.next();
            String donate = scanner.next();
            int b = 0;
            double a = switch (tax) {
                case "A" -> 1;
                case "B" -> 1 - 0.1;
                case "C" -> 1 - 0.2;
                case "D" -> 1 - 0.29;
                case "E" -> 1 - 0.35;
                default -> 1;
            };


            switch (donate) {
                case "n" -> b = 0;
                case "y" -> b = -10;
            }

            double c;
            if (h > 40) {
                c = (hp * 40) + (2 * hp * (h - 40));
            } else {
                c = hp * h;
            }

            System.out.printf("%.2f\n", c * a + b);
        }
    }
}
