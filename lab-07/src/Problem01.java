import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] counts = new int[11];

        System.out.print("N: ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            int d1 = 1 + random.nextInt(6);
            int d2 = 1 + random.nextInt(6);

            ++counts[d1 + d2 - 2];
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%2d: %d%n", i + 2, counts[i]);
        }
    }
}