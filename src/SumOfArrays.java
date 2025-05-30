import java.util.Scanner;

public class SumOfArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = scn.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("For 1st array");
            array1[i] = scn.nextInt();
        }

        System.out.println("Enter second num");
        int n2 = scn.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("For 2nd");
            array2[i] = scn.nextInt();
        }
//
//        int array1Num = getNumber(array1);
//        int array2Num = getNumber(array2);
//        System.out.println(array1Num + array2Num);
//    }
//
//    public static int getNumber(int[] array) {
//        int fullNumber = 0;
//        int power = 1;
//        for (int i = array.length - 1; i >= 0; i--) {
//            fullNumber += array[i] * power;
//            power *= 10;
//        }
//        return fullNumber;

//        How shown in the video
        int[] sum = new int[n1 > n2 ? n1 : n2];
        
        int carry = 0;

        int i = array1.length - 1;
        int j = array2.length - 1;
        int k = sum.length - 1;

        while (k >= 0) {
            int d = carry;

            if (i >= 0) {
                d += array1[i];
            }
            if (j >= 0) {
                d += array2[j];
            }
            carry = d / 10;
            d %= 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        if (carry != 0) {
            System.out.println(carry);
        }

        for (int val : sum) {
            System.out.println(val);
        }
    }
}
