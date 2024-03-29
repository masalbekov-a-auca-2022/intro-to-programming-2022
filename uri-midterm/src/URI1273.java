import java.util.Scanner;

public class URI1273 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = 0;
        while (true) {
            int n = scanner.nextInt();
            q++;
            if (n == 0) {
                break;
            } else if (q != 1) {
                System.out.println();
            }
            scanner.nextLine();
            int a = 0;
            String[] c = new String[n];
            for (int i = 0; i < n; i++) {
                String h = scanner.nextLine();
                c[i] = scanner.nextLine().trim();
                a = Math.max(a, c[i].length());
            }
            for (String h : c) {
                int numSpacesToAdd = a - h.length();
                if (numSpacesToAdd > 0) {
                    for (int i = 0; i < numSpacesToAdd; i++) {
                        System.out.print(" ");
                    }
                }
                System.out.println(h);
            }

        }
    }
}
