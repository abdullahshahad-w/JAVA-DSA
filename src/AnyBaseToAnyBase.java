import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int decimal = toDecimal(n, b1);
        int result = decToAnyBase(decimal, b2);
        System.out.println(result);
    }

    public static int toDecimal(int n, int b) {
        if (b == 10) {
            return n;
        } else {
            int rv = 0;
            int p = 1;
            while (n > 0) {
                rv += (n % 10) * p;
                n /= 10;
                p *= b;
            }
            return rv;
        }
    }

    public static int decToAnyBase(int n, int b) {
        if (b == 10) {
            return n;
        } else {
            int rv = 0;
            int p = 1;
            while (n > 0) {
                rv += (n % b) * p;
                n /= b;
                p *= 10;
            }
            return rv;
        }
    }
}