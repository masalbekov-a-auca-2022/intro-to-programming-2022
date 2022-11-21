import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Integer? ");
        int n = scanner.nextInt();
        int length = Integer.toString(n).length();
        int temp;
        int sum = 0;

        while (length > 0) {
            length--;
            temp = n % 10;
            n /= 10;
            sum += temp;
        }
        System.out.printf("The sum of all digits is %s%n", sum);
    }
}
