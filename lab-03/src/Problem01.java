import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        System.out.print("some real number? ");
        Scanner num = new Scanner(System.in);
        double number = num.nextDouble();
        System.out.println("|" + number + "| = " + Math.abs(number));
    }
}
