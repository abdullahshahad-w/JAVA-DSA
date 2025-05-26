import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int x = 0;
        int y = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(x + "\t");
                int sum = x + y;
                x = y;
                y = sum;
            }
            System.out.println();
        }
    }
}
