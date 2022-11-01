import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int speed = b -a;
        if (speed >= 1 && speed <=20){
            System.out.println("You are speeding and your fine is $100.\n");
        }  else if (speed >= 21 && speed <30){
            System.out.println("You are speeding and your fine is $270.\n");
        }  else if(speed < 1){
            System.out.println("Congratulations, you are within the speed limit!");
        }else {
            System.out.println("You are speeding and your fine is $500.\n");
        }
    }
}
