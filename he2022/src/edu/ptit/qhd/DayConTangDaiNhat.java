package edu.ptit.qhd;

import java.util.Scanner;

public class DayConTangDaiNhat {
    public static void main(String[] args) {
        int i, j, n, a[] = new int[1001], f[] = new int[1001], kq = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i = 0; i < n; i++) a[i] = in.nextInt();
        for (i = 0; i < n; i++) {
            f[i] = 1;
            for (j = 0; j < i; j++)
                if (a[j] < a[i])
                    f[i] = Math.max(f[i], f[j] + 1);
            kq = Math.max(kq, f[i]);
        }

        System.out.println(kq);
    }
}
