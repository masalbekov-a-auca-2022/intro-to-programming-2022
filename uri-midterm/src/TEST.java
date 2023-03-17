import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = 0;
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            q++;
            if (q != 1) {
                System.out.println();
            }
            scanner.nextLine();
            String[] words = new String[n];
            int longestWordLength = 0;
            for (int i = 0; i < n; i++) {
                words[i] = scanner.nextLine().trim();
                longestWordLength = Math.max(longestWordLength, words[i].length());
            }
            for (String word : words) {
                int numSpacesToAdd = longestWordLength - word.length();
                if (numSpacesToAdd > 0) {
                    for (int i = 0; i < numSpacesToAdd; i++) {
                        System.out.print(" ");
                    }
                }
                System.out.println(word);
            }
        }
    }
}
