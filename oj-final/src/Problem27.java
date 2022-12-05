import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int counter = 0;
        for (int i = 1; i <= a - 3; i++) {
            for (int j = i + 1; j <= a - 2; j++) {
                for (int k = j + 1; k <= a - 1; k++) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

