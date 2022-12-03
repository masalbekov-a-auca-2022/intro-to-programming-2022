import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            String c = scanner.next();
            for (int j = 0; j < b; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}