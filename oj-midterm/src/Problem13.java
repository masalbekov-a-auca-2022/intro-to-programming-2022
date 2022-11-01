import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int a1 = a/100;
        int a2 = a/10%10;
        int a3 = a%10;
        int b1 = b/100;
        int b2 = b/10%10;
        int b3 = b%10;
        if ((a3*100 + a2*10 + a1 ) > (b3*100 +b2*10+b1)){
            System.out.println(a3*100 + a2*10 + a1);
        } else {
            System.out.println(b3*100 +b2*10+b1);
        }

    }
}
