import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int y = scanner.nextInt();
        System.out.print("Month: ");
        int m = scanner.nextInt();
        if (readInt(y, m) == true){
            System.exit(0);
        }
        System.out.printf("Number of days: %d", getDaysOfMonth(y ,m));

    }
    public static int getDaysOfMonth(int y, int m) {
        int day = 0;
        if (isLeapYear(y) == true && m == 2) {
            day = 29;
        } else {
            switch (m) {
                case 1, 3, 5, 7, 8, 10, 12 -> day = 31;
                case 2 -> day = 28;
                case 4, 6, 9, 11 -> day = 30;
            }
        }
        return day;
    }


    public static boolean isLeapYear(int y) {
        boolean a;
        if (y % 4 == 0 || y % 100 == 0 && y % 400 == 0) {
            a = true;
        } else {
            a = false;
        }
        return a;
    }
    public static boolean readInt(int y, int m){
        boolean c = false;
        if (y < 1 || m > 12 || m < 1){
            c = true;
        }
        return c;
    }
}
