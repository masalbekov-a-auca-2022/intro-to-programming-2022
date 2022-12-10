import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minX = 101;
        int minY = 101;
        int maxX = 0;
        int maxY = 0;
        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            int b = a.indexOf(",");
            int x = Integer.parseInt(a.substring(0, b));
            int y = Integer.parseInt(a.substring(b + 1));
            if (x > maxX) {
                maxX = x;
            }
            if (x < minX) {
                minX = x;
            }
            if (y > maxY) {
                maxY = y;
            }
            if (y < minY) {
                minY = y;
            }
        }
        System.out.println((minX - 1) + "," + (minY - 1) + "\n" + (maxX + 1) + "," + (maxY + 1));
    }
}


