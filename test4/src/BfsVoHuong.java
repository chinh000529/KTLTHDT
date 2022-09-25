import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsVoHuong {
    static ArrayList<Integer> dske[] = new ArrayList[1005];
    static boolean notChecked[] = new boolean[1005];
    static int pre[] = new int[1005];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-->0){
            int n = input.nextInt(), m = input.nextInt(), start = input.nextInt();
            int end = input.nextInt();
            for (int i = 0; i<=n; i++){
                dske[i] = new ArrayList<>();
                notChecked[i] = true;
                pre[i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                int u = input.nextInt(), v = input.nextInt();
                dske[u].add(v);
//                dske[v].add(u);
            }
//            System.out.print("BFS("+start+") = ");
            bfs(start);
//            for (int i = 1; i <= n; i++) {
//                if(i<n) System.out.print(pre[i]+ " -> ");
//                else System.out.print(pre[i]);
//            }
//            System.out.println();
            trace(start, end);
        }
    }
    public static void trace(int start, int end){
        if (notChecked[end]){
            System.out.println(-1);
        } else {
            Queue<Integer> queue = new LinkedList<>();
            while (start != end){
                queue.add(start);
                start = pre[start];
            }
            queue.add(end);
            while (!queue.isEmpty()){
                 int v = queue.poll();
                System.out.print(pre[v]);
            }
        }
    }
    public static void bfs (int u){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u); notChecked[u] = false;
        int j = 1;
        while(!queue.isEmpty()){
            int v = queue.poll();
//            pre[j] = v;
//            j++;
            for (Integer i : dske[v]){
                if(notChecked[i]){
                    notChecked[i] = false;
                    queue.add(i);
                    pre[v] = u;
                }
            }

        }
    }
}
