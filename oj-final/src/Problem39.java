import java.util.Scanner;

public class Problem39 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] calories = {461, 431, 420, 0, 100, 57, 70, 0, 130, 160, 118, 0, 167, 266, 75, 0};

        int total = 0;

        for (int i = 0; i < 4; i++) {
            total += calories[scanner.nextInt() - 1 + i * 4];
        }

        System.out.printf("Your total Calorie count is %d.%n", total);
    }

}