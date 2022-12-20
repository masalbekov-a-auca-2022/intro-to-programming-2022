import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {

        for (int k =1; k< 1000;k+=100 ){
            System.out.printf("%3d          %.4f%n", k, M(k));
        }
    }

    public static double M(int i) {
        double x = 0;
        for (int j = 1; j <= i; j++) {
            x += (Math.pow((-1), j + 1)) / (2 * j - 1);
        }
        return x * 4;
    }
}