package test2;

import java.util.Scanner;
import java.util.Stack;

public class SoNgoacVuongLonNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        s = in.nextLine();
        xuLy(s);
    }

    private static void xuLy(String s) {
        Stack<Character> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else {
                if (stack.isEmpty()) res = 0;
                char in = stack.peek(), out = s.charAt(i);
                if (in == '(' && out == ')') stack.pop();
                else if (in == '[' && out == ']') {
                    stack.pop();
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
