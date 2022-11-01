import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n){
            case 1, 9, 10:
                n = 1;
                break;
            case 2, 3, 7, 8:
                n =2;
                break;
            case 4, 5, 6:
                n = 3;
                break;
        }
        System.out.print(n);
    }
}
