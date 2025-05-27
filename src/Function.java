import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nfactorial = factorial(n);

        int nmrfactorial = factorial(n - r);

        int npr = nfactorial / nmrfactorial;

        System.out.println(npr);
    }

    public static int factorial(int x) {
        int rv = 1;
        for (int i = 1; i <= x; i++) {
            rv *= i;
        }
        return rv;
    }
}
