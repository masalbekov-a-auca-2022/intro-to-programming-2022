import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a2 = a%10;
        int a1 = a/10%10;
        System.out.println(a2 +""+a1);
    }
}
