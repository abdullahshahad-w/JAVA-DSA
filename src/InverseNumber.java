import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

//        int f = 0;
//        int pos = 1;
//        while (n > 0) {
//            int r = n % 10;
//            f += (int) (pos * Math.pow(10, r - 1));
//            pos++;
//            n /= 10;
//        }
//
//        System.out.println(f);

//        How shown in the solution

        int inv = 0;
        int oriPos = 1;
        while (n != 0) {
            int invPos = n % 10;
            int invDig = oriPos;

            inv += invDig * (int) Math.pow(10, invPos - 1);
            oriPos++;
            n /= 10;
        }

        System.out.println(inv);
    }
}
