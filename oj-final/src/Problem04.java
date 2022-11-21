import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        for (int i = 0; i < days; i++) {
            int c = scanner.nextInt();
            int time = scanner.nextInt();
            int answer = ((time * (time + 1) / 2) + time);
            System.out.println(c + " " + answer);
        }
    }
}