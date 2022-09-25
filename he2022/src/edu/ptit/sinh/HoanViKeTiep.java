package edu.ptit.sinh;

import java.util.Scanner;

public class HoanViKeTiep {
    static int[] array = new int[1002];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                array[i] = in.nextInt();
            }
//            swapInt(array, 1, 2);
//            for (int ii = 1; ii <= n; ii++)
//                System.out.print(array[ii] + " ");
//            System.out.println();
            generate(n, array);
        }
    }

    public static void generate(int n, int[] a) {
//      Duyệt ngược từ vị trí n-1, đến khi nó < kề trước nó
        int i = n - 1;
        while (i > 0 && a[i] > a[i + 1]) i--;
        if (i <= 0) {
            for (int ii = 1; ii <= n; ii++)
                System.out.print(ii + " ");
            System.out.println(); //      1. Duyệt hết -> in ra cấu hình đầu tiên
        } else {
            int k = n;
            while (a[k] < a[i]) k--; //      2. Swap nó và phần tử cuối
            swapInt(a, k, i);
            int l = i + 1, r = n;
            while (l < r) {
                swapInt(a, l, r);
                l++;
                r--;
            }
            for (int ii = 1; ii <= n; ii++)
                System.out.print(a[ii] + " ");
            System.out.println();
        }
    }

    public static void swapInt(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
