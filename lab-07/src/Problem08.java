import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] scores = new double[100];

        int count = 0;
        double sum = 0;

        System.out.println("Enter a new score (enter a negative number to end): ");

        for (int i = 0; i < 100; i++) {
            double score = scanner.nextDouble();

            if (score < 0) {
                break;
            }

            scores[i] = score;
            count++;
            sum += scores[i];
        }

        double minimum = sum / count;
        int aboveOrEqual = 0;

        for (int i = 0; i <= count; i++) {
            if (scores[i] >= minimum) {
                aboveOrEqual++;
            }
        }

        System.out.println("Count is " + count);
        System.out.printf("The average is %1.2f%n", minimum);
        System.out.println("Number of scores above or equal to average is: " + aboveOrEqual);
        System.out.println("Number of scores below the average is: " + (count - aboveOrEqual));
    }
}