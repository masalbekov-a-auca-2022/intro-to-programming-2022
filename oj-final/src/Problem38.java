import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] chessMain = { 1, 1, 2, 2, 2,8};
        int [] chess = new int [6];
        for (int i =0; i < 6; i++){
            chess[i] = scanner.nextInt();
        }
        for (int i =0; i <6; i++){
            System.out.printf("%d ", chessMain[i] - chess[i]);
        }

    }
}
