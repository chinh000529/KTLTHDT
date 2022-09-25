package edu.ptit.thamLam.SapXepCongViec;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    static Task[] tasks = new Task[1005];

    public static void main(String[] args) {
        int n, t, i, j, d;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            n = in.nextInt();
            for (i = 0; i < n; i++)
                tasks[i] = new Task(in.nextInt());
            in.nextLine();
            for (i = 0; i < n; i++)
                tasks[i].setFinish(in.nextInt());
            Arrays.sort(tasks, 0, n);
            i = 0;
            d = 1;
            for (j = 1; j < n; j++) {
                if (tasks[j].getStart() >= tasks[i].getFinish()) {
                    i = j;
                    d++;
                }
            }

            System.out.println(d);
        }
    }
}
