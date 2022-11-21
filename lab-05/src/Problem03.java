import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of tests? ");
        int not = scanner.nextInt();
        int correct = 0;
        int wrong = 0;
        for (int i = 0; i < not; i++) {
            int v1 = (int) (Math.random() * 15);
            int v2 = (int) (Math.random() * 15);
            System.out.printf("%d + %d = ", v1, v2);
            int answer = scanner.nextInt();
            if (v1 + v2 == answer) {
                correct++;
            } else wrong++;
        }
        System.out.printf("Number of correct answers: %s\n", correct);
        System.out.printf("Number of incorrect answers: %s", wrong);
    }
}