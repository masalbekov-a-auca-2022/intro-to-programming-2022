import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudent = scanner.nextInt();

        int[] scores = new int[numOfStudent];

        System.out.print("Enter " + numOfStudent + " scores: ");
        for (int i = 0; i < numOfStudent; i++) {
            scores[i] = scanner.nextInt();
        }

        printGrades(scores, findBestGrade(scores));
    }

    static void printGrades(int[] grades, int bestGrade) {
        for (int j = 0; j < grades.length; j++) {
            String letterGrade;

            if (grades[j] >= (bestGrade - 10)) {
                letterGrade = "A";
            } else if (grades[j] >= (bestGrade - 20)) {
                letterGrade = "B";
            } else if (grades[j] >= (bestGrade - 30)) {
                letterGrade = "C";
            } else if (grades[j] >= (bestGrade - 40)) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            System.out.println("Student " + j + " score is " + grades[j] + " and grade is " + letterGrade);
        }
    }

    static int findBestGrade(int[] grades) {
        int best = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > best) {
                best = grades[i];
            }
        }
        return best;
    }
}