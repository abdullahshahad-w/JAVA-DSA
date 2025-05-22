import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int temp1 = num1;
        int temp2 = num2;

        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        int gcd = num2;

        System.out.println("GCD: " + gcd);
        int lcm = (temp1 * temp2) / gcd;
        System.out.println("LCM: " + lcm);
    }
}
