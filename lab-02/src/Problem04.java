import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        System.out.print("Length in inches? ");
        Scanner num = new Scanner(System.in);
        int inch = num.nextInt();
        System.out.print(inch + " in. = " + inch * 2.54 + " cm.");
    }
}
