import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a3 = scanner.nextInt(); int a2 = scanner.nextInt(); int a1 = scanner.nextInt();
        int b3 = scanner.nextInt(); int b2 = scanner.nextInt(); int b1 = scanner.nextInt();
        int totalA= a3*3 +a2*2+a1;
        int totalB=b3*3+b2*2+b1;
        if (totalB > totalA){
            System.out.println("B");
        } else if (totalA > totalB){
            System.out.println("A");
        } else {
            System.out.println("T");
        }
    }
}
