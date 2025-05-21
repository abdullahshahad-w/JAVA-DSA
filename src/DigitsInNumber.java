import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        int bruh = n;

        int digits = 0;
        while (bruh > 0) {
            bruh = bruh / 10;
            digits++;
        }

        int tens = (int) Math.pow(10, digits - 1);
        while (tens > 0) {
            System.out.println(n / tens);
            n %= tens;
            tens /= 10;
        }
    }
}
