public class DataTypes {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x + y;

        System.out.println("Sum of " + x + " and " + y + " is: " + sum);

//        xy

        int prd = x * y;

        System.out.println("Product of " + x + " and " + y + " is: " + prd);

//        x / y, y / x, x % y

        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;

//        exp (BODMAS in computers)
        int exp = (x * y) / (x + y);

        System.out.println(exp);
    }
}
