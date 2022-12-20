import java.util.Scanner;

public class Problem02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int year = readInt("Year: ", "incorrect year", 10000);
        int month = readInt("Month: ", "incorrect month", 12);

        System.out.println("Number of days: " + getDaysOfMonth(year, month));
    }

    static int getDaysOfMonth(int year, int month) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int res = days[month - 1];
        if (month == 2 && isLeap(year)) {
            ++res;
        }

        return res;
    }

    static int readInt(String prompt, String errorMessage, int maxValue) {
        System.out.print(prompt);
        int result = scanner.nextInt();

        if (result < 1  || result > maxValue) {
            System.out.println(errorMessage);
            System.exit(1);
        }

        return result;
    }

    static boolean isLeap(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}