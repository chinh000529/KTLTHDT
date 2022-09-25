package graph;

import java.util.Iterator;

public class DsCanhSangKe {
	static java.util.ArrayList<Integer> dske[] = new java.util.ArrayList[1005];
	static boolean chuaxet[] = new boolean[1005];

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt(), m = in.nextInt();
			for (int i = 1; i <= n; i++) {
				dske[i] = new java.util.ArrayList<>();
				chuaxet[i] = true;
			}
			for (int i = 1; i <= m; i++) {
				int u = in.nextInt(), v = in.nextInt();
				dske[u].add(v);
			}
			for (int i = 1; i <= n; i++) {
				System.out.print(i + ": ");
				for (Integer j : dske[i]) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}
}
