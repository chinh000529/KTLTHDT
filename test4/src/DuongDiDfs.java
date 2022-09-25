import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DuongDiDfs {
    static boolean[] notChecked= new boolean[1005];
    static int [] pre = new int[1005];
    static ArrayList<Integer>[] dske = new ArrayList[1005];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0) {
            int n = input.nextInt(), m = input.nextInt(), start = input.nextInt();
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
            dfs(start);
            for (int end = 1; end<=n; end++){
                if (end != start){
                    if (notChecked[end]) System.out.println("No path");
                    else {
                        Stack<Integer> stack = new Stack<>();
                        stack.push(end);
                        while (stack.peek() != start){
                            int x = stack.peek();
                            stack.push(pre[x]);
                        }
                        while (!stack.isEmpty()){
                            System.out.print(stack.peek() + " ");
                            stack.pop();
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void dfs (int u){
        notChecked[u] = false;
        for(Integer v:dske[u]){
            if (notChecked[v]){
                dfs(v);
                pre[v] = u;
            }
        }
    }
}
