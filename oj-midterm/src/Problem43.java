import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();
        switch (code){
            case "MG" -> System.out.println("midget girls");
            case "MB" -> System.out.println("midget boys");
            case "JG" -> System.out.println("junior girls");
            case "JB" -> System.out.println("junior boys");
            case "SG" -> System.out.println("senior girls");
            case "SB" -> System.out.println("senior boys");
            default -> System.out.println("invalid code");
        }
    }
}
