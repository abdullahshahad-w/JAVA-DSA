import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the number of times you want to check: ");

        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Enter a number to check: ");
            int n = scn.nextInt();

            boolean isPrime = true;
            for (int j = 2; j * j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
