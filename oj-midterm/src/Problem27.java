import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= 3 && b >=95){
            System.out.println("C.C. is absolutely satisfied with her pizza.");
        } else if (a ==1 && b<=50){
            System.out.println("C.C. is fairly satisfied with her pizza.");
        } else {
            System.out.println("C.C. is very satisfied with her pizza.");
        }
    }
}
