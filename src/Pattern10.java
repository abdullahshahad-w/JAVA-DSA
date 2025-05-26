import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int outer = n / 2;
        int inner = -1;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < outer; j++) {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for (int j = 0; j < inner; j++) {
                System.out.print("\t");
            }

            if (i > 1 && i < n) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                outer--;
                inner += 2;
            } else {
                outer++;
                inner -= 2;
            }

            System.out.println();
        }
    }
}
