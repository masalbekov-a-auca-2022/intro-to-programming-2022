import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int d = b + b -a;
        System.out.println(d);
    }
}
