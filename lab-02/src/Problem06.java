import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        System.out.print("Enter a degree in Celsius: ");
        Scanner num = new Scanner(System.in);
        double a = num.nextDouble();
        System.out.println(a + " Celsius is " + ((a * 9/5.0) + 32) + " Fahrenheit" );

    }
}
