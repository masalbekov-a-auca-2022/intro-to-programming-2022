import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int g = scanner.nextInt();
        int t = scanner.nextInt();
        int total = 0;
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            int item = scanner.nextInt();
            total += item;
        }
        System.out.println((int) ((g - t) * 0.9 - total));
    }
}
