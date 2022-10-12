import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        System.out.print("Temperature in degrees Fahrenheit? ");
        Scanner num = new Scanner(System.in);
        int fahrenheit = num.nextInt();
        double celsius = 5/9.0 *( fahrenheit-32);
        System.out.printf("The temperature in degrees Celsius is %.2f", celsius);
    }
}
