package edu.ptit.qhd;

import java.util.Scanner;

public class ConEchQhdFibo {
    public static void main(String[] args) {
        long[] f = new long[55];
        int n;
        long t;
        int i;
        f[0] = 1;
        f[1] = 1;
        f[2] = 2;
        for (i = 3; i <= 50; i++) f[i] = f[i - 3] + f[i - 2] + f[i - 1];

        Scanner in = new Scanner(System.in);

        t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            n = in.nextInt();
            System.out.println(f[n]);
        }
    }
}
