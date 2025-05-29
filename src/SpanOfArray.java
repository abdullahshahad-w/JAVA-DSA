import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = inputArray(n);

        System.out.println(arrayMax(array) - arrayMin(array));
    }

    public static int arrayMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]  > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int arrayMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]  < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int[] inputArray(int n) {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Number: ");
            array[i] = scn.nextInt();
        }
        return array;
    }
}
