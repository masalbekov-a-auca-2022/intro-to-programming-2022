import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == 60 && b ==60 && c ==60){
            System.out.println("Equilateral");
        } else if(a+b+c==180 && a ==c | b == c | a ==b){
            System.out.println("Isosceles");
        } else if (a+b+c !=180){
            System.out.println("Error");
        } else {
            System.out.println("Scalene");
        }
    }
}
