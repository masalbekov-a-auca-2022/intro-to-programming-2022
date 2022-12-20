import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N: ");
        int a = scanner.nextInt();
        int[] c = new int[a];
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            c[i] = b;
        }
        System.out.printf(reverseArray(c));

    }

    static void reverseArray(int[] c) {
        int i = 0;
        int j = c.length - 1;

        while (i < j) {
            int t = c[i];

            c[i] = c[j];
            c[j] = t;

            ++i;
            --j;
        }
    }
}