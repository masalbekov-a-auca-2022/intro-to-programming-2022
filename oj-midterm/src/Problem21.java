import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        if (a > b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
