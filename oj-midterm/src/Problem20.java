import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if (a / 10000 == 555) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
