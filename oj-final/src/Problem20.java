import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int w =0;
        int l=0;
        while (i <6){
            String a = scanner.next();
            if (a.equals("W")){
                w+=1;
            } else {
                l +=1;
            }
            i++;
        }
        if (w > 4){
            System.out.println("1");
        } else if (w >2){
            System.out.println("2");

        } else if (w > 0){
            System.out.println("3");
        } else {
            System.out.println("-1 ");
        }
    }
}
