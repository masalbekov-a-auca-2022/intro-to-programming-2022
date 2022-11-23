import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int answer = 1;
        int b = 2;
        if (a == 0 || a == 1) {
            System.out.println(0);
        } else {
            while (a > b) {
                b *= 2;
                answer++;
            }
            System.out.println(answer);
        }
    }
}