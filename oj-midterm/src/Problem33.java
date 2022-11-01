    import java.util.Scanner;

    public class Problem33 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.next();
            int x = a.indexOf("(");
            String firstPart = a.substring(0,x);
            String secondPart = a.substring(x +2);
            if (firstPart.equals(secondPart) ){
                System.out.println("correct");
            } else {
                System.out.println("fix");
            }
        }
    }
