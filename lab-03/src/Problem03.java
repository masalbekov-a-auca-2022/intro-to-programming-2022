import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        System.out.print("1st number? ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        System.out.print("2nd number? ");
        int b = num.nextInt();
        System.out.print("3rd number? ");
        int c = num.nextInt();
        if (a>=b && a >=c) {
            System.out.println("The value " + a + " is the greatest one.");
        }
        else if(c >= a && c>=b){
            System.out.print("The value " + c + " is the greatest one.");
        } else {
            System.out.println("The value " + b + " is the greatest one.");
        }

    }
}
