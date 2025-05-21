import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        scn.nextLine();
        String name = scn.nextLine();

        System.out.println("Dear " + name + ", here is the counting.");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
