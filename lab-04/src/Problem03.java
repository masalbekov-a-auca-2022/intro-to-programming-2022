import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        System.out.print("month? ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String a = "";
        switch (month) {
            case 12:
            case 1:
            case 2:
                a = "winter";
                break;
            case 3:
            case 4:
            case 5:
                a = "spring";
                break;
            case 6:
            case 7:
            case 8:
                a = "summer";
                break;
            case 9:
            case 10:
            case 11:
                a = "fall";
                break;
        }
        System.out.println(a);
    }
}

