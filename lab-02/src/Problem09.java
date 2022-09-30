import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes: ");
        Scanner num = new Scanner(System.in);
        long p = num.nextLong();
        int y = (int)(p/60/24/365);
        int d = (int)(p/60/24-y*365);
        System.out.printf(p + " minutes is approximately %d years and %d days", y, d);

    }
}
