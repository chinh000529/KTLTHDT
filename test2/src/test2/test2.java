package test2;

import java.util.Scanner;
import java.util.Stack;

public class test2 {
    static int[] indexes = new int[100005];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        String eq;
        while (t-- > 0) {
            eq = in.nextLine();
            xuLy(eq);
        }
    }

    private static void xuLy(String eq) {
        Stack<Integer> stack = new Stack<>();
        int i, index =0;
        for (i = 0; i < eq.length(); i++){
            if (eq.charAt(i) == '('){
                stack.push(i);
//                indexes[i] = index;
                index++;
                indexes[i] = index;
            } else if (eq.charAt(i) == ')'){
                int j = stack.peek();
                stack.pop();
                if (i - j == 2) {
                    indexes[j] = index;
                    indexes[i] = index;
                }
                if (eq.charAt(j+1) == '(' && eq.charAt(i-1) == ')') {
                    indexes[j + 1] = index;
                    indexes[i - 1] = index;
                }
            }
        }
        for (i = 0; i<eq.length(); i++){
//            if (indexes[i] > 0)
            System.out.print(indexes[i] + " ");
        }
        System.out.println();
    }
}
