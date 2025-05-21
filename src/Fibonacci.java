import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int n = scn.nextInt();

        int x = 0, y = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(x);
            int sum = x + y;
            x = y;
            y = sum;
        }
    }
}
