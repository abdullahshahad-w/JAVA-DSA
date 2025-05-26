import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int star = 1;
        int space = 2 * n - 3;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                star--;
                val--;
            }
            for (int j = 0; j < star; j++) {
                val--;
                System.out.print(val + "\t");
            }
            System.out.println();
            star++;
            space -= 2;
        }
    }
}
