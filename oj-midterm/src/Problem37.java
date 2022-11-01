import java.util.Scanner;


public class Problem37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double a1;
        double b1;

        if (a > 100){
            a1 = (a-100)*25;
        } else {
            a1=0;
        }
        double a2 = 15*b;
        double a3 = 25*c;

        if (b > 250){
            b1 = (b-250)*45;
        } else {
            b1=0;
        }
        double b2= 35*b;
        double b3= 25*c;
        double aa = a1+a2+a3;
        double bb = b1 +b2+b3;
        if (a>b){
            System.out.printf("Plan A costs %d%nPlan B costs %d%nPlan A is cheapest.", aa, bb);
        } else {
            System.out.printf("Plan A costs %d%nPlan B costs %d%nPlan B is cheapest.", aa, bb);
        }
    }
}
