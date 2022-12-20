import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            int year = scanner.nextInt();

            int month = scanner.nextInt();

            int day = scanner.nextInt();
            if (day < 1 || day > 31) {
                System.out.println("Wrong input of day");
                System.exit(1);
            }

            System.out.println(getNumberOfDays(month, year) + day);
        }
    }

    static int getNumberOfDays(int month, int year) {
        int day = 0;

        if (month == 2) {
            day = 31;
        } else {
            for (; month != 0; month--) {
                switch (month) {
                    case 1:
                        break;
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        day += 31;
                        break;
                    case 2:
                        day += isLeapYear(year) ? 29 : 28;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        day += 30;
                        break;
                    default:
                        System.out.println("Wrong input of month");
                        System.exit(1);
                        break;
                }
            }
        }
        return day;
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}