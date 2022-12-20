import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = new int[10];

        System.out.print("Enter ten integers: ");

        for (int i = 0; i < 10; i++) {
            list[i] = scanner.nextInt();
        }

        int[] finishedArray = eliminateDuplicates(list);

        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < finishedArray.length; i++) {
            System.out.print(finishedArray[i] + " ");
        }
    }

    static int[] eliminateDuplicates(int[] list) {
        int[] list2 = new int[list.length];
        int x = 0;

        for (int i = 0; i < list.length; i++) {
            boolean dup = false;

            for (int k = 0; k < list.length; k++) {
                if (list2[k] == list[i]) {
                    dup = true;
                }
            }

            if (!dup) {
                list2[x++] = list[i];
            }
        }
        int[] finishedArray = new int[x];

        for (int i = 0; i < x; i++) {
            finishedArray[i] = list2[i];
        }
        return finishedArray;
    }
}