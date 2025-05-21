import java.util.Scanner;

public class PrimeBetweenRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int low = scn.nextInt();
        System.out.print("Enter High range: ");
        int high = scn.nextInt();

        for (int i = low; i <= high; i++) {

            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
