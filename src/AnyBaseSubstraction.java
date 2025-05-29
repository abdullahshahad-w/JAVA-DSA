import java.util.Scanner;

public class AnyBaseSubstraction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int base = scn.nextInt();
        int sub = substraction(num1, num2, base);
        System.out.println(sub);
    }

    public static int substraction(int num1, int num2, int base) {
        int result = 0;
        int borrow = 0;
        int p = 1;
        while (num2 > 0) {
            int dig1 = num2 % 10;
            int dig2 = num1 % 10;
            num2 /= 10;
            num1 /= 10;

            dig1 -= borrow;
            int digit;

            if (dig1 >= dig2) {
                digit = dig1 - dig2;
                borrow = 0;
            } else {
                digit = dig1 + base - dig2;
                borrow = 1;
            }
            result += digit * p;
            p *= 10;
        }
        return result;
    }
}
