package edu.ptit.sinh;

import java.util.Scanner;

public class ToHopNguocGenerate {
    static int a[] = new int[21], n, k;
    static boolean isTheLast;

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int t = inScanner.nextInt();
        inScanner.nextLine();
        while (t-- > 0) {
            n = inScanner.nextInt();
            k = inScanner.nextInt();
            isTheLast = false;
            for (int i = 1; i <= k; i++) {
                a[i] = i;
            }
            while (!isTheLast) {
                generate();
                for (int i = 1; i <= k; i++) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    public static void generate() {
        int i = k, j;
        while (i > 0 && a[i] == a[i - 1] + 1) i--;
        if (i == 1) {
            for (j = k; j >= 1; j--) {
                a[j] = n - k + j;
            }
            isTheLast = true;
        } else {
            a[i]--;
            for (j = i + 1; j <= k; j++) {
                a[j] = n - k + j;
            }
        }
    }
}
