import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a > b && a > c) {
            boolean isRight = (a * a) == (b * b) + (c * c);
            System.out.println(isRight);
        } else if (b > a && b > c) {
            boolean isRight = (b * b) == (a * a) + (c * c);
            System.out.println(isRight);
        } else {
            boolean isRight = (c * c) == (b * b) + (a * a);
            System.out.println(isRight);
        }
    }
}
