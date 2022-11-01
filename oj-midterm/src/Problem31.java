import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        if (month <=2 && day <18 || month <2){
            System.out.println("Before");
        } else if (day >18 || month > 2){
            System.out.println("After");
        } else{
            System.out.println("Special");
        }
    }
}
