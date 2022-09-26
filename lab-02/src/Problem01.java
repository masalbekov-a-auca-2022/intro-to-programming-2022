import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        System.out.print("1st value? ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        System.out.print("2nd value? ");
        int number2 = num.nextInt();
        System.out.println("Before swapping: a = " + number + "; b = " + number2 + ";");
        int temp = number;
        number = number2;
        number2 = temp;
        System.out.println("After swapping: a = " + number + "; b = " + number2 + ";");


    }
}
