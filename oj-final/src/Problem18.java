import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0;
        boolean isTrue = true;

        while (isTrue) {
            if (Math.pow(a,  2) > num) {
                a--;
                isTrue = false;
            } else {
                a++;
            }
        }
        System.out.println("The largest square has side length " + a + ".");
    }
}
