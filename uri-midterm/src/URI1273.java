import java.util.Scanner;

public class URI1273 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = 0;
        while (true) {
            int n = scanner.nextInt();
            q++;
            if (n == 0) {
                System.out.println();
                break;
            } else if (q != 0) {
                System.out.println();
                System.out.println();
            }
            scanner.nextLine();
            int a = 0;
            int b = 0;
            String[] c = new String[n];
            for (int i = 0; i < n; i++) {
                String h = scanner.nextLine();
                c[i] = h;
                b = h.length();
                if (b > a) {
                    a = b;
                }
            }
            for (int j = 0; j < n; j++) {
                int y = a - c[j].length();
                for (int i = 0; i < y; i++) {
                    System.out.print(" ");
                }
                if (j != n-1) {
                    System.out.println(c[j]);
                } else {
                    System.out.print(c[j]);
                }
            }

        }
    }
}
