import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String word = sc.nextLine();
        int first = 0;
        int last = word.length() - 1;
        boolean isPalindrome = true;
        while (first < last) {
            if (word.charAt(first) != word.charAt(last)) {
                isPalindrome = false;
                break;
            }
            first++;
            last--;
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}