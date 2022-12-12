import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int g = scanner.nextInt();
            String m = "";
            if (g <= 45 && g >= 0 || g >=315 && g <=360) {
                m = "N";
            } else if (g <= 135 && g > 45) {
                m = "E";
            } else if (g <= 225 && g > 135) {
                m = "S";
            } else if (g < 315 && g > 225) {
                m = "W";
            }

            System.out.println(m);
            }
        }
    }

