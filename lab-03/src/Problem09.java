import java.util.Random;
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        Random rand = new Random();
        int upperbound = 3;
        int computer = rand.nextInt(upperbound);
        if (player == 0) {
            String r = "scissor";
        } else if (player == 1) {
            String r = "rock";
        } else {
            String r = "paper";
        }
        if (computer == 0) {
            String e = "scissor";
        } else if (computer == 1) {
            String e = "rock";
        } else {
            String e = "paper";
        }
        if (player == computer){
            System.out.printf("The computer is %d. You are %d too. It is a draw%n", computer, player);
        } else if (computer == 0 &&

    }
}

