import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner input = new Scanner (System.in);
        String userName = input.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Your name in upper-case: " + userName.toUpperCase());
        System.out.println("Your name in lower-case: " + userName.toLowerCase());
        System.out.println("The total number of characters is " + userName.length());




    }
}
