import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Year? ");
        int year = num.nextInt();
        int length = (int) (Math.log10(year) + 1);
        int y = (length / 100)*100;
        if (year % 100 == 0 || (year - y) % 4 == 0 ) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }
    }
}
