package edu.ptit.chiaVaTri;

import java.util.Scanner;

public class FiboWord {
    static long[] F = new long[100];

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= 92; i++) F[i] = F[i - 1] + F[i - 2];
        int t = inScanner.nextInt();
        inScanner.nextLine();
        while (t-- > 0) {
            int n = inScanner.nextInt();
            long k = inScanner.nextLong();
//            inScanner.nextLine();
            if (n == 0 && k == 0) break;
            System.out.println(fiboWordN(n, k));
        }
    }

    public static char fiboWordN(int n, long k) {
        if (n == 1) return 'A';
        if (n == 2) return 'B';
        if (k <= F[n - 2]) return fiboWordN(n - 2, k);
        return fiboWordN(n - 1, k - F[n - 2]);
    }
}
