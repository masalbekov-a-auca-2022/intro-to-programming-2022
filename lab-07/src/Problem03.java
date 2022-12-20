import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N:");
        int a = scanner.nextInt();
        int[] c = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.printf("Enter %d element: ",i );
            int b = scanner.nextInt();
            c[i] = b;
        }
        System.out.println("Before reversing:");
        for (int j =0; j < c.length; j++){
            System.out.print(c[j] + " ");
        }
        System.out.println();
        reverseArray(c);
        System.out.println("After reversing:");
        for (int k = 0; k < c.length; k++) {
            System.out.print(c[k] + " ");
        }

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