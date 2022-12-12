import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        int a = scanner.nextInt();
        int y = scanner.nextInt();
        int b = scanner.nextInt();
        int c =0;
        while (a < b){
             a +=a * p*0.01;
             c++;
        }
        System.out.println(y+c);
    }
}
