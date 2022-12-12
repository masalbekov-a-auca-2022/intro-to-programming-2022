import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max_bid = 0;
        String winner = "";
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int bid = scanner.nextInt();
            if (bid > max_bid) {
                max_bid = bid;
                winner = name;
            }
        }
        System.out.println(winner);
    }
}
