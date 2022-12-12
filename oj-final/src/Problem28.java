import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b * 2 + 3; j++) {
                if (j == 0 || j == b + 1 || j == 2 * b + 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < b * 2 + 3; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < b + 2; j++) {
                if (j == b + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}