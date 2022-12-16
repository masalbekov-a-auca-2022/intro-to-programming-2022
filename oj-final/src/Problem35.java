import java.util.Scanner;

public class Problem35 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int bestFishCasper = findTheBestFish(n);
        int c = scanner.nextInt();
        int bestFishNatalie = findTheBestFish(c);
        if (bestFishCasper > bestFishNatalie) {
            System.out.println("Casper");
        } else if (bestFishNatalie > bestFishCasper) {
            System.out.println("Natalie");
        } else {
            System.out.println("Tie");
        }


    }

    public static int findTheBestFish(int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a * b > max) {
                max = a * b;
            }
        }
        return max;
    }
}
