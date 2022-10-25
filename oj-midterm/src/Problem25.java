import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String a = str.next();
        if (a.contains("ss")){
            System.out.println("hiss");
        } else {
            System.out.println("no hiss");
        }
    }
}
