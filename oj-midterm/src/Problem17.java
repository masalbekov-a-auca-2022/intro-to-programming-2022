import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int s = num.nextInt();
        int m = num.nextInt();
        int l = num.nextInt();
        int h = s + 2 * m + 3 * l;
        if (h >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
