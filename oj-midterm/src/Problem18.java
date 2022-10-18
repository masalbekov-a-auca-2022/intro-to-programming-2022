import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int d = num.nextInt();
        int t = num.nextInt();
        int r = Math.abs(c - a) + Math.abs(d - b);
        if (r <=t && (t - r)%2 == 0) {
            System.out.println("Y");
        }else {
            System.out.println("N");
        }
    }
}