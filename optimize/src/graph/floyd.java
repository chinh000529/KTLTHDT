package graph;

public class floyd {
	static int a[][] = new int[1005][1005];
	static int n, m;
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int i, j, u, v, w;
		n = in.nextInt(); m = in.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				if(i==j) a[i][j] = 0;
				else a[i][j] = (int)1e9;
			}
		}
		for (i = 1; i <= m; i++) {
			u = in.nextInt(); v = in.nextInt(); w = in.nextInt();
			a[u][v] = w;
			a[v][u] = w;
		}
		
		floyd();
		
		int q = in.nextInt();
		while (q-->0) {
			u = in.nextInt(); v = in.nextInt();
			System.out.println(a[u][v]);
		}
	}
	private static void floyd() {
		int i,j,k;
		for (k=1; k<=n; k++) {
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= n; j++) {
					if(a[i][j] > a[i][k] + a[k][j]) {
						a[i][j] = a[i][k] + a[k][j];
					}
				}
			}
		}
	}
	
}
