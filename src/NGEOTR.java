import java.util.Scanner;
import java.util.Stack;

public class NGEOTR {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        int[] nge = new int[arr.length];
        st.push(arr[arr.length - 1]);
        nge[nge.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for (int val : nge) {
            System.out.print(val);
        }

    }
}
