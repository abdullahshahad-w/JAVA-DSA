public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];

        array[0] = 33;
        array[1] = 47;
        array[2] = 59;
        array[3] = 67;
        array[4] = 98;

//        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
