import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        final String overlap = a < b & b > c & c < d & d > a
                ? "YES"
                : "NO";
        System.out.println(overlap);
    }
}
