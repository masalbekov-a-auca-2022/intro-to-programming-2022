import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i > m) {
                int d1 = i / 100;
                int d2 = (i / 10) - (i / 100) * 10;
                int d3 = i - (i / 10) * 10;
                int sumd = (int) (Math.pow(d1, 3) + Math.pow(d2, 3) + Math.pow(d3, 3));
                if (i == sumd) {
                    System.out.println(i);
                }
            }
        }
    }
}
