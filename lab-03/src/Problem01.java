import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        System.out.print("some real number? ");
        Scanner num = new Scanner(System.in);
        double number = num.nextDouble();
        double abs_number = Math.abs(number);
        System.out.printf("| %.4f| = %.4f", number, abs_number);
    }
}
