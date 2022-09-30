import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        System.out.print("Enter a number in pounds: ");
        Scanner num = new Scanner(System.in);
        double p = num.nextDouble();
        System.out.println( p + " pounds is " + p * 0.454 + " kilograms");


    }
}
