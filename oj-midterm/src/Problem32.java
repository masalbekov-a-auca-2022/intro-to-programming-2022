import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        int day = scanner.nextInt();
        if (month.contains("OCT") & day == 31 | month.contains("DEC") & day == 25) {
            System.out.println("yup");

        } else if (month.contains("OCT") & day < 30 | month.contains("DEC") & day < 25 | day >25){
        System.out.println("nope");
    } else {
        System.out.println("nope");
    }
}
}
