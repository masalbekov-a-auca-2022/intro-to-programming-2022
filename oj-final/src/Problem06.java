import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = (int) Math.sqrt(b * b + c * c);
        for (int i = 0; i < a; i++) {
            int n = scanner.nextInt();
            if (n <= d) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
