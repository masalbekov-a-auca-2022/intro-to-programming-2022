import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Year? ");
        int year = num.nextInt();
        System.out.print("Month? ");
        int month = num.nextInt();
        int leap;
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
            leap = 1;
        } else {
            leap = 0;
        }
        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
        }
        if (leap == 0) {
            System.out.printf("Number of days: %s%n", day);
        } else if (day == 28){
            System.out.printf("Number of days: %s%n", day+1);
        }
    }
}
