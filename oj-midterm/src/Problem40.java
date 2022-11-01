
import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fC= scanner.nextInt();
        int sC= scanner.nextInt();
        if (fC >0 & sC>0){
            System.out.println("1");
        } if (fC <0 & sC>0){
            System.out.println("2");
        }if (fC <0 & sC<0){
            System.out.println("3");
        }if (fC >0 & sC<0){
            System.out.println("4");
        }
    }
}
