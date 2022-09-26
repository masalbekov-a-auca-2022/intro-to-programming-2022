import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        System.out.print("1st value? ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        System.out.print("2nd value? ");
        int b = num.nextInt();
        System.out.println("Before swapping: a = " + a + "; b = " + b + ";");
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping: a = " + a + "; b = " + b + ";");


    }
}
