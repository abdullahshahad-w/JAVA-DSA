import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = scn.nextInt();

        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }
}
