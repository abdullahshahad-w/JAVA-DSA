import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int temp = n;
        int digits = 0;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        k %= digits;
        if (k < 0) {
            k = digits + k;
        }

//        int lastDigits = n % (int) Math.pow(10, k);
//        int left = n / (int) Math.pow(10, k);
//        int result = lastDigits * (int) Math.pow(10, digits - k);
//        result += left;
//
//        System.out.println(result);

        int div = 1;
        int mult = 1;
        for (int i = 1; i <= digits; i++) {
            if (i <= k) {
                div *= 10;
            } else {
                mult *= 10;
            }
        }

        int q = n / div;
        int r = n % div;

        int rot = r * mult + q;
        System.out.println(rot);
    }
}
