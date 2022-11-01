import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a == 8 | a == 9 && d == 8 | d == 9 && b == c) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
    }
}
