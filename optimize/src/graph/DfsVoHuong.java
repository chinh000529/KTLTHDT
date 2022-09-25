package graph;

public class DfsVoHuong {
	static java.util.ArrayList<Integer> dske[] = new java.util.ArrayList[1005]; 
	static boolean chuaxet[] = new boolean[1005];
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int t = in.nextInt();
		while (t-->0) {
			int n = in.nextInt(), m = in.nextInt(), start = in.nextInt();
			for(int i=1; i<=n; i++) {
				dske[i] = new java.util.ArrayList<>();
				chuaxet[i] = true;
			}
			for (int i=1; i<=m; i++) {
				int u = in.nextInt(), v = in.nextInt();
				dske[u].add(v);
				dske[v].add(u);
			}
			dfs(start);
			System.out.println();
		}
	}

	private static void dfs(int u) {
		System.out.print(u + " ");
		chuaxet[u] = false;
		for (Integer v:dske[u]) {
			if (chuaxet[v]) dfs(v);
		}
	}
}
