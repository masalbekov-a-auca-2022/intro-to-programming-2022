import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        System.out.print("1st int? ");
        Scanner intg = new Scanner(System.in);
        int number = intg.nextInt();
        System.out.print("2st int? ");
        int number2 = intg.nextInt();
        System.out.println(number + " + " + number2 + " = " + (number + number2));
        System.out.println(number + " - " + number2 + " = " + (number - number2));
        System.out.println(number + " * " + number2 + " = " + (number * number2));
        System.out.println(number + " / " + number2 + " = " + (number / number2));
        System.out.println(number + " % " + number2 + " = " + (number % number2));

    }
}
