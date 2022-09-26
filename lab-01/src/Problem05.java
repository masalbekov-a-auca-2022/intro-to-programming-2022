import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        System.out.print("1st double? ");
        Scanner intg = new Scanner(System.in);
        double number = intg.nextDouble();
        System.out.print("2nd double? ");
        double number2 = intg.nextDouble();
        System.out.println(number + " + " + number2 + " = " + (number + number2));
        System.out.println(number + " - " + number2 + " = " + (number - number2));
        System.out.println(number + " * " + number2 + " = " + (number * number2));
        System.out.println(number + " / " + number2 + " = " + (number / number2));
        System.out.println(number + " % " + number2 + " = " + (number % number2));

    }
}
