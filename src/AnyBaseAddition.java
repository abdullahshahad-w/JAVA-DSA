import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int base = scn.nextInt();
        int add = add(num1, num2, base);
        System.out.println(add);
    }

    public static int add(int num1, int num2, int base) {
        int carry = 0;
        int add = 0;
        int p = 1;
        while (num1 > 0 || num2 > 0 || carry > 0) {
            int dig1 = num1 % 10;
            num1 /= 10;
            int dig2 = num2 % 10;
            num2 /= 10;
            int sum = carry + dig1 + dig2;
            add += (sum % base) * p;
            carry = sum / base;
            p *= 10;
        }
        return add;
    }
}
