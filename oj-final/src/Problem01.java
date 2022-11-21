import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        /*int a = ((s.length())-2)*2;
        if (s.contains("e")){
            System.out.println("h"+("e".repeat(a))+"y");
        }*/ // Решение без for
        String amount = s.substring(1, s.length() - 1);
        String result = "";
        for (int i = 0; i < amount.length() * 2; i++) {
            result += "e";
        }
        System.out.println("h" + result + "y");
    }
}
