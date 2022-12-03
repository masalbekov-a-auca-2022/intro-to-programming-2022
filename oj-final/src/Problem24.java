import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int answer = 0;
        int sum;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                sum = i + j;
                if (sum == 10) {
                    answer++;
                }
            }
        }


        if (answer == 1) {
            System.out.println("There is 1 way to get the sum 10.");
        } else {
            System.out.println("There are " + answer + " ways to get the sum 10.");
        }
    }
}