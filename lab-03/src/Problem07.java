import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = num.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = num.nextInt();
        int dayInFuture = (today + elapsed) % 7;
        String dayNameToday ="", dayNameFuture ="";
        if (today == 0) {
            dayNameToday = "Sunday";
        } else if (today == 1) {
            dayNameToday = "Monday";
        } else if (today == 2) {
            dayNameToday = "Tuesday";
        } else if (today == 3) {
            dayNameToday = "Wednesday";
        } else if (today == 4) {
            dayNameToday = "Thursday";
        } else if (today == 5) {
            dayNameToday = "Friday";
        } else if (today == 6) {
            dayNameToday = "Saturday";
        }
        if (dayInFuture == 0) {
            dayNameFuture = "Sunday";
        } else if (dayInFuture == 1) {
            dayNameFuture = "Monday";
        } else if (dayInFuture == 2) {
            dayNameFuture = "Tuesday";
        } else  if (dayInFuture == 3) {
            dayNameFuture = "Wednesday";
        } else if (dayInFuture == 4) {
            dayNameFuture = "Thursday";
        } else if (dayInFuture == 5) {
            dayNameFuture = "Friday";
        } else if (dayInFuture == 6) {
            dayNameFuture = "Saturday";
        }
        System.out.println("Today is " + dayNameToday + " and the future day is " + dayNameFuture);
    }
}