import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
