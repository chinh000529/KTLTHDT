package edu.ptit.sinh;

import java.util.Scanner;

public class XauNhiPhanKeTiep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        String s;
        while (t-- > 0) {
            s = in.nextLine();
            generate(s);
        }
    }

    public static void generate(String s) {
        int i = s.length() - 1;
        StringBuffer next = new StringBuffer(s);
        while (i >= 0 && s.charAt(i) == '1') {
            next.setCharAt(i, '0');
            i--;
        }
        if (i >= 0) next.setCharAt(i, '1');
        System.out.println(next);
    }
}
