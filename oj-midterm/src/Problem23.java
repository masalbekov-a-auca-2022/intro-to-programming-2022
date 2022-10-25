import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int h = num.nextInt();
        int m = num.nextInt();

        if (h == 0) {
            h = 24;
        }
        int time = ((h * 60 + m) - 45) / 60;
        int time2 = (h * 60 + m) - 45 - time * 60;

        System.out.println(time + " " + time2);
    }
}