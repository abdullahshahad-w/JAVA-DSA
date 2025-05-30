import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.size() == 0) {
                    System.out.println(false);
                    return;
                } else if (stack.peek() != '(') {
                    System.out.println(false);
                    return;
                } else {
                    stack.pop();
                }
            } else if (ch == ']') {
                if (stack.size() == 0) {
                    System.out.println(false);
                    return;
                } else if (stack.peek() != '[') {
                    System.out.println(false);
                    return;
                } else {
                    stack.pop();
                }
            } else if (ch == '}') {
                if (stack.size() == 0) {
                    System.out.println(false);
                    return;
                } else if (stack.peek() != '{') {
                    System.out.println(false);
                    return;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.size() != 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
