import java.util.Scanner;

public class Problem42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = 5 * t -400;
        System.out.println(a);
        if (a < t){
            System.out.println("1");
        } if (a >t){
            System.out.println("-1");
        } if (a==t){
            System.out.println("0");
        }
    }
}
