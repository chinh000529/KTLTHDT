package graph;

public class BfsVoHuong {
	static java.util.ArrayList<Integer> dske[] = new java.util.ArrayList[1005]; 
	static boolean chuaxet[] = new boolean[1005];
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int t = in.nextInt();
		while (t-->0) {
			int n = in.nextInt(), m = in.nextInt(), start = in.nextInt();
			for(int i=0; i<=n; i++) {
				dske[i] = new java.util.ArrayList<>();
				chuaxet[i] = true;
			}
			for (int i=1; i<=m; i++) {
				int u = in.nextInt(), v = in.nextInt();
				dske[u].add(v);
				dske[v].add(u);
			}
			bfs(start);
			System.out.println();
		}
	}

	private static void bfs(int u) {
		java.util.Queue<Integer> queue = new java.util.LinkedList<>();
		queue.add(u); chuaxet[u] = false;
		while (!queue.isEmpty()) {
			int v = queue.poll(); // lay ra
			System.out.print(v + " ");
			for (Integer i : dske[v]) {
				if(chuaxet[i]) {
					chuaxet[i] = false;   
					queue.add(i);
				}
			}
		}
	}
}
