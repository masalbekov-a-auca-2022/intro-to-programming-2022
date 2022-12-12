import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int y = input.nextInt();
            int m = input.nextInt();
            int d = input.nextInt();
            if (y + 18 < 2007) {
                System.out.println("Yes");
            } else if (y + 18 == 2007 && m < 2) {
                System.out.println("Yes");
            } else if (y + 18 == 2007 && m == 2 && d <= 27) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}