import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p =scanner.nextInt();
        int pi = scanner.nextInt();
        if (pi>p){
            System.out.println("Dr. Chaz will have " + (pi-p)+ " pieces of chicken left over!");
        } else {
            System.out.println("Dr. Chaz needs "+ (p-pi)+" more pieces of chicken!\n");
        }
    }
}
