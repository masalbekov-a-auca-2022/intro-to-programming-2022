import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        if (a >= b) {
            System.out.println(b + " " + a);
        } else {
            System.out.println(a + " " + b);
        }
    }
}