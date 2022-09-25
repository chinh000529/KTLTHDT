package edu.ptit.sinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ToHopNguoc {
    static int a[] = new int[21], n, k;
    static boolean isTheLast;
    static ArrayList<String> res = new ArrayList<>();

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int t = inScanner.nextInt();
        inScanner.nextLine();
        while (t-- > 0) {
            n = inScanner.nextInt();
            k = inScanner.nextInt();
            isTheLast = false;
            String first = "";
            for (int i = 1; i <= k; i++) {
                a[i] = i;
                first = first + " " + a[i];
            }
            res.add(first);
            while (!isTheLast) {
                generate();
            }
            res.sort(Collections.reverseOrder());
            for (String i : res)
                System.out.println(i.trim());
            res.clear();
        }
    }

    public static void generate() {
        int i, j;
        i = k;
        String item = "";
        while (i > 0 && a[i] == n - k + i) i--;
        if (i > 0) {
            a[i] = a[i] + 1;
            for (j = i + 1; j <= k; j++) {
                a[j] = a[i] + j - i;
            }
            for (int t = 1; t <= k; t++)
                item = item + " " + a[t];
            res.add(item);
        } else {
            isTheLast = true;
        }
    }
}
