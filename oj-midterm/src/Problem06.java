import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Type width and length:");
        int width = num.nextInt();
        int length = num.nextInt();
        System.out.print("Type tile side: ");
        int tile_side = num.nextInt();
        int amount_x = width/tile_side;
        int amount_y = length/tile_side;
        int tile_amount = amount_x*amount_y;
        System.out.println(tile_amount);

    }
}
