import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        System.out.println("i          m(i)    ");
        System.out.println("-------------------");

        result((int) num);
    }

    static void result(int num) {
        double result = 0;
        for (double i = 1; i <= num; i++) {
            result += i / (i + 1);
            System.out.printf("%.0f          %.4f%n", i, result);
        }
    }
}