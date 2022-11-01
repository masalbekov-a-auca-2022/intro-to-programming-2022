import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (b > c && b > a && d >c && a<d){
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
