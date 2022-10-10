import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int r = num.nextInt();
        int h = num.nextInt();
        System.out.println((Math.PI*r*r*h)/3.0);
    }
}
