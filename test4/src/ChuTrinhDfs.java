import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ChuTrinhDfs {
    static boolean[] notChecked = new boolean[1005];
    static int[] pre = new int[1005];
    static ArrayList<Integer>[] dske = new ArrayList[1005];
    static boolean ok;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            ok = false;
            int n = input.nextInt(), m = input.nextInt();
            for (int i = 1; i <= n; i++) {
                dske[i] = new ArrayList<>();
                notChecked[i] = true;
                pre[i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                int u = input.nextInt(), v = input.nextInt();
                dske[u].add(v);
                dske[v].add(u);
            }
            for (int i = 1; i <= n; i++) {
                if (notChecked[i]){
                    if (ok){
                        dfs(i);
                    }
                }
            }
        }
    }

    public static void dfs(int u) {
        notChecked[u] = false;
        for (Integer v : dske[u]) {
            if (notChecked[v]) {
                dfs(v);
                pre[v] = u;
            } else if (v != pre[u]) {
                System.out.print(v + " ");
                ok = true;
            }
        }
        ok = false;
    }
}
