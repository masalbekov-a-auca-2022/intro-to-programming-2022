import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        if (a % b == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
