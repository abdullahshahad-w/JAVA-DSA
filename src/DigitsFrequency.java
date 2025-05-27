import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int check = scn.nextInt();

        int frequency = frequency(n, check);
        System.out.println(frequency);
    }

    public static int frequency(int num, int check) {
        int count = 0;
        while (num != 0) {
            if (num % 10 == check) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
