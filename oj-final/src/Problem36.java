import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double beats = scanner.nextDouble();
            double sec = scanner.nextDouble();
            System.out.printf("%.4f %.4f %.4f %n", beatsPerMinute(beats - 1, sec), beatsPerMinute(beats, sec), beatsPerMinute(beats + 1, sec));
        }


    }

    public static double beatsPerMinute(double beats, double sec) {
        return (beats * 60) / sec;
    }
}
