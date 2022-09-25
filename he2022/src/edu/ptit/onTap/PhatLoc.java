package edu.ptit.onTap;

import java.util.Scanner;

public class PhatLoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 6) return;
        generate(n);
    }

    private static void generate(int n) {
        int[] str = new int[17];
        for (int i = 1; i <= n; i++) str[i] = 6;
        while (true) {
            boolean ok = true;
            if (str[1] == 8 && str[n] == 6) {
                for (int i = 1; i <= n; i++) {
                    if (str[i] == 8 && str[i + 1] == 8) {
                        ok = false;
                        break;
                    }
                    if (str[i] == 6 && str[i + 1] == 6 && str[i + 2] == 6 && str[i + 3] == 6) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    for (int i = 1; i <= n; i++)
                        System.out.print(str[i]);
                    System.out.println();
                }
            }
            int vt = n;
            while (str[vt] == 8 && vt >= 1) {
                str[vt] = 6;
                vt--;
            }
            if (vt <= 0) break;
            str[vt] = 8;
        }
    }
}
