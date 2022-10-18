import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int dis = num.nextInt();
        String pos = num.next();
        int shot = num.nextInt();
        if(pos.equals("Infront")) {
            int r = dis - shot;
            System.out.println(r);
        } else {
            int r = dis + shot;
            System.out.println(r);
        }
    }
}
