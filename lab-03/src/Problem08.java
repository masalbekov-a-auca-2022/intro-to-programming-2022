import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        System.out.print("Enter three integer numbers: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c){
            if (b > c){
                System.out.printf("%d%n%d%n%d%n", c, b, a);
            } else {
                System.out.printf("%d%n%d%n%d%n", b, c, a);
            }

        }
        if (b > a && b > c){
            if (a > c){
                System.out.printf("%d%n%d%n%d%n", c, a, b);
            } else {
                System.out.printf("%d%n%d%n%d%n", a, c, b);
            }

        }
        if (c > b && c > a) {
            if (b > a) {
                System.out.printf("%d%n%d%n%d%n", a, b, c);
            } else {
                System.out.printf("%d%n%d%n%d%n", b, a, c);
            }
        }

    }

}
