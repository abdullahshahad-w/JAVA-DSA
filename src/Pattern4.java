import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}

