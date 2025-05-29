import java.io.LineNumberReader;
import java.util.Scanner;

public class AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int product = multiply(n1, n2, b);
        System.out.println(product);
    }

    public static int multiply (int n1, int n2, int b) {
        int result = 0;
        int power = 1;
        while (n2 > 0) {
            int dig = n2 % 10;
            n2 /= 10;
            int product = multiplySingle(n1, dig, b);
            result = add(result * power, product, b);
            power *= 10;
        }
        return result;
    }

    public static int multiplySingle(int n1, int n2, int b) {
        int result = 0;
        int carry = 0;
        int power = 1;
        while (n1 > 0 || carry > 0) {
            int d1 = n1 % 10;
            n1 /= 10;
            int digit = d1 * n2 + carry;
            carry = digit / b;
            result += (digit % b) * power;
            power *= 10;
        }
        return result;
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
