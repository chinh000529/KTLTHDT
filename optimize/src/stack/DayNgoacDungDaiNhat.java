package edu.ptit.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine();
            System.out.println(calculate(s));
        }
    }

    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                stack.pop();
                if (!stack.isEmpty()) {
                    res = Math.max(res, i - stack.peek());
                } else stack.push(i);
            }
        }
        return res;
    }
}
