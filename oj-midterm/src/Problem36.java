import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int e = scanner.nextInt();
        if (a >=3 & e <=4){
            System.out.println("TroyMartian");
        } if (a <=6 & e >=2){
            System.out.println("VladSaturnian");
        } if (a <=2 && e <=3){
            System.out.println("GraemeMercurian");
        }
    }
}
