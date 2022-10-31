import java.util.Random;
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner scanner = new Scanner(System.in);
        int player = scanner.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(3);
        System.out.printf("The computer is %s. You are %s", nameofShape(computer), nameofShape(player));
        System.out.print(player == computer ? " too. " : ". ");
        if (player == 0 && computer == 2) {
            System.out.println("You won");
        } else if (computer == 0 && player == 2) {
            System.out.println("Computer won");
        } else if (player < computer) {
            System.out.println("Computer won");
        } else if (computer < player) {
            System.out.println("You won");
        } else {
            System.out.println("It is a draw");
        }
    }

    public static String nameofShape(int n) {
        return switch (n) {
            case 0 -> "scissor";
            case 1 -> "rock";
            case 2 -> "paper";
            default -> null;
        };
    }
}


