import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        System.out.print("Enter the number of years: ");
        Scanner num = new Scanner(System.in);
        int y = num.nextInt();
        double a = 31536000;
        double b = 312032486;
        b = b + y*(a/7.0) + y*(a/45.0) - y*(a/13.0);
        System.out.println("The population in " + y + " years is " + Math.round(b));
    }
}
