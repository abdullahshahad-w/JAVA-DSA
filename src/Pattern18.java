import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int space = 0;
        int star = n;
        int innerSpace = n - 3;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < star) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (i <= n / 2) {
                star -= 2;
                space++;
            } else {
                star += 2;
                space--;
            }
            System.out.println();
        }
    }
}
