import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adj = scanner.nextInt();
        int noun = scanner.nextInt();

        String[] adjective = new String[adj];
        String[] nouns = new String[noun];

        for (int i = 0; i < adj; i++) {
            adjective[i] = scanner.next();
        }
        for (int i = 0; i < noun; i++) {
            nouns[i] = scanner.next();
        }

        for (int i = 0; i < adj; i++) {
            for (int j = 0; j < noun; j++) {
                System.out.println(adjective[i] + " as " + nouns[j]);
            }
        }
    }
}