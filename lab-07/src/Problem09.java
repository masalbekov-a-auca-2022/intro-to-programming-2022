import java.util.*;

public class Problem09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double[] num = new double[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextDouble();
        }

        int x = indexOfSmallestElement(num);
        System.out.println("The smallest index element is " + x + " with a value of " + num[x]);
    }

    public static int indexOfSmallestElement(double[] array) {

        double smallest = Double.MAX_VALUE;
        int smallIdx = 0;

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                smallIdx = i;
            }
        }

        return smallIdx;
    }
}