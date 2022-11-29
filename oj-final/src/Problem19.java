import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int m = scanner.nextInt();
        int i =0;
        while (i < 101) {
            i++;
            if ((i * x  % m == 1)) {
                System.out.println(i);
                break;
            }
            if (i == 101) {
                System.out.println(" No such integer exists.");
            }
        }
    }
}

