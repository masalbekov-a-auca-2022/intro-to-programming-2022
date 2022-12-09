import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int amount1=0;
        int amount2=0;
        for (int i = 0; i<n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a > b){
                amount2+=a;
            } else if(a < b){
                amount1+=b;
            }
        }
        System.out.println((100-amount1) +"\n"+ (100-amount2));
    }
}
