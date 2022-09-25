package edu.ptit.qhd;

import java.util.Scanner;

public class BacThangQhdFibo {
    static final int M = 1000000007;

    public static int calulate(int n, int k) {
        int i, j, f[] = new int[100005];
        f[0] = 1;
        f[1] = 1;
        for (i = 2; i <= n; i++) {
            for (j = 1; j <= Math.min(i, k); j++)
                f[i] = (f[i] + f[i - j]) % M;
        }
        return f[n];
    }

    public static void main(String[] args) {
        int t, n, k;
        Scanner in = new Scanner(System.in);

        t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            System.out.println(calulate(n, k));
        }
    }
}
