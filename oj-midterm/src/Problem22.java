import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if (n % 2 == 0) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}
