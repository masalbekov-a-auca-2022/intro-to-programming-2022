import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (isPalindrome(a)) {
            System.out.println("true");
        } else {
            System.out.println(reverse(a));
        }
    }

    public static int reverse(int a) {
        int reversed = 0;
        while (a != 0) {
            int b = (a % 10);
            reversed = reversed * 10 + b;
            a /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int a) {
        return a == reverse(a);
    }
}
