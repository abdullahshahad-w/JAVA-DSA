import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int i = 2;
        while (n != 1) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
            i++;
        }

//        How shown in the solution

//        for (int i = 2; i * i <= n ; i++) {
//            while (n % i == 0) {
//                System.out.print(i + " ");
//                n /= i;
//            }
//        }
//
//        if (n != 1) {
//            System.out.print(n);
//        }
    }
}
