import java.util.Scanner;public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int sum = n;
        int i = 0;
        while (sum <= p ){
            sum+= n*r;
            n*=r;
            i++;
        }
        System.out.println(i);
    }
}


