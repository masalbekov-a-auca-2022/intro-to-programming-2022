import java.util.Scanner;

public class Problem44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (b >0 | b <0){
            b = -b;
        }
        if (a ==0 &&b>0|b<0){
            System.out.println("undefined");
        } if (b ==0 & a ==0){
            System.out.println("indeterminate");
        } else if (b>0|b<0 && a>0|a<0){
            double x = b/a;
            System.out.printf("%.2f", x);
        }
    }
}
