import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        System.out.print("A four-digit integer? ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();

        int first_digit = number/1000;
        int second_digit = number/100 - first_digit * 10;
        int third_digit = number/10 - number/100 * 10;
        int fourth_digit = number - number/10 * 10;
        int sum = first_digit + second_digit + third_digit + fourth_digit;

        System.out.println("The sum of all digits is " + sum);
    }
}