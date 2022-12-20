import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0) {
            int minP = 65000;
            int minX = 0;
            int minY = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                for (int j = i; j <= n; j++) {
                    if(i * j == n) {
                        if(2 * (i + j) < minP) {
                            minP = 2 * (i + j);
                            minX = i;
                            minY = j;
                        }
                    }
                }
            }
            System.out.printf("Minimum perimeter is %d with dimensions %d x %d%n", minP, minX, minY);
            n = input.nextInt();
        }
    }
}