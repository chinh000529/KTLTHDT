package edu.ptit.chiaVaTri;

import java.util.Scanner;

public class TinhLuyThua {
    static final long M = 1000000007;

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
//        int t = inScanner.nextInt();
//        inScanner.nextLine();
        while (true) {
            int n = inScanner.nextInt();
            long k = inScanner.nextLong();
//            inScanner.nextLine();
            if (n == 0 && k == 0) break;
            System.out.println(powMod(n, k));
        }
    }

    public static long powMod(int n, long k) {
        if (k == 0) return 1;
        long x = powMod(n, k / 2);
        if (k % 2 == 0) return x * x % M;
        return n * (x * x % M) % M;
    }
}
