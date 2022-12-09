import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int range = b - a ;
        int num = (int) Math.floor(range / 60) + 1;
        for (int i = 0; i < num; i++) {
            int answer = a+60*i;
            System.out.println("All positions change in year "+answer);
        }
    }
}
