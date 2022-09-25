package edu.ptit.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraBieuThucSoHoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.nextLine();
            if (isRedundant(s)) System.out.println("Yes");
            else System.out.println("No");
        }
    }

    public static boolean isRedundant(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else if (s.charAt(i) == ')') {
                int j = stack.peek();
                stack.pop();
                if (i - j == 2) return true; // kiểm tra đầu cuối stack cách nhau 2 ký tự
                if (s.charAt(j + 1) == '(' && s.charAt(i - 1) == ')')
                    return true;
            }
        }
        return false;
    }
}
