import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        double a = w/(h*h);
        if (a > 25){
            System.out.println("Overweight");
        } else if (a >18.5 && a<=25){
            System.out.println("Normal weight\n");
        } else {
            System.out.println("Underweight\n");
        }
    }
}
