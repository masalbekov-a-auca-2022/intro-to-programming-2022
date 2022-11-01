import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = scanner.nextInt();
        double d = scanner.nextInt();
        System.out.println((int)Math.ceil((h/Math.sin(Math.toRadians(d)))));
    }
}
