import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum += n;
            n *= 10;
        }
        System.out.println(sum);
    }
}