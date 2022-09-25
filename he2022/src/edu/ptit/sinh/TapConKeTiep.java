package edu.ptit.sinh;

import java.util.Scanner;

public class TapConKeTiep {
    static int a[] = new int[1001], b[] = new int[1001], n, k;

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int t = inScanner.nextInt();
        inScanner.nextLine();
        while (t-- > 0) {
            n = inScanner.nextInt();
            k = inScanner.nextInt();
            for (int i = 1; i <= k; i++)
                a[i] = inScanner.nextInt();
            generate();
        }
    }

    public static void generate() {
        int i, j;
        i = k;
        while (i > 0 && a[i] == n - k + i) i--;
        if (i > 0) {
            a[i] = a[i] + 1;
            for (j = i + 1; j <= k; j++) {
                a[j] = a[i] + j - i;
            }
            // print loop 0 -> k, a[i]
        } else {
            // print loop 0 -> k, i
        }
    }

    public static void show(int ca) {
        int i;
        switch (ca) {
            case 1:
                for (i = 1; i <= k; i++) {
                    if (i == k) System.out.print(a[i]);
                    else System.out.print(a[i] + " ");
                }
                System.out.println();
                break;
            case 2:
                for (i = 1; i <= k; i++) {
                    if (i == k) System.out.print(i);
                    else System.out.print(i + " ");
                }
                System.out.println();
                break;
        }
    }
}
