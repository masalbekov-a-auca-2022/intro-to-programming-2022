import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bats = 0;
        double score = 0;
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++) {
            int score1 = scanner.nextInt();
            if (score1 < 0) continue;
            bats++;
            score += score1;
        }
        System.out.println(score / bats);
    }
}
