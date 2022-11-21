import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            String word = scanner.next().strip();
            if ((i + 1) % 2 != 0) {
                System.out.println(word);
            }
        }
    }
}