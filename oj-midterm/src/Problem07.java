import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int R1 = num.nextInt();
        int S = num.nextInt();
        int R2 = S*2-R1;
        System.out.println(R2);
    }
}
