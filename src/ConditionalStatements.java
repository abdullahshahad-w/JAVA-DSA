public class ConditionalStatements {
    public static void main(String[] args) {
        int x = 11;

        if (x % 2 == 0) {
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }

        System.out.println("Hard work is better than Smart work");

        int n1 = 20;
        int n2 = 10;

        if (n1 == n2) {
            System.out.println(n1 + " is equal to " + n2);
        } else if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else {
            System.out.println(n1 + " is less than " + n2);
        }

//        Task Solution

        int mark = 80;

        if (mark > 90) {
            System.out.println("Excellent");
        } else if (mark > 80) {
            System.out.println("Good");
        } else if (mark > 70) {
            System.out.println("Fair");
        } else if (mark > 60) {
            System.out.println("Meets Expectations");
        } else {
            System.out.println("Bellow par");
        }


    }
}
