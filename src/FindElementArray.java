import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int find = scn.nextInt();
        int[] array = SpanOfArray.inputArray(n);
        System.out.println(findArray(array, find));
    }
    
    public static int findArray(int[] array, int find) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find) {
                index = i;
            }
        }
        return index;
    }
}
