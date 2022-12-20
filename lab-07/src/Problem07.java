import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = new int[100];
        int num;
        int count = 0;

        System.out.print("Enter the integers between 1 and 100: ");
        do {
            num = input.nextInt();
            list[count] = num;
            count++;
        }
        while (num != 0);

        listOfOccurrences(list);
    }

    public static void listOfOccurrences(int[] list) {
        for (int i = 1; i <= 100; i++) {
            int occurs = 0;

            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == i)
                    occurs += 1;
            }

            if (occurs != 0)
                System.out.printf("%d occurs %d %s%n",
                        i, occurs, occurs > 1 ? "times" : "time");
        }
    }
}