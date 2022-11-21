import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int amount = -1;
        int num;
        do {
            num = scanner.nextInt();
            amount++;
            total += num;
        } while (num != 0);

        if (total != 0) {
            System.out.printf("The arithmetic mean is %.1f%n", Double.valueOf(total) / amount);
        } else {
            System.out.println("Nothing to calculate");
        }
    }
}