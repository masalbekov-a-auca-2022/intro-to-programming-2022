import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int star = 0;
        for (int i = 0; i < n; i++) {
            int points = scanner.nextInt() * 5 - scanner.nextInt() * 3;
            if (points > 40){
                star++;
            }

        }
        if (n == star){
            System.out.println(star + "+");
        } else {
            System.out.println(star);
        }

    }
}
