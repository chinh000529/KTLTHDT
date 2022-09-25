package graph;

public class DsKeSangCanh {
	static java.util.ArrayList<Integer> dske[] = new java.util.ArrayList[1005];
	static boolean chuaxet[][] = new boolean[1005][1005];
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			dske[i] = new java.util.ArrayList<>();
			int u = in.nextInt(), v = in.nextInt();
			dske[i].add(u);
			dske[i].add(v);
		}
		for (int i = 1; i <= n; i++) {
			for (Integer j : dske[i]) {
				java.util.Arrays.asList(j).sort(java.util.Comparator.comparingInt(o -> o));
			}
		}
		for (int i = 1; i <= n; i++) {
			for (Integer j : dske[i]) {
				if(!chuaxet[i][j] && !chuaxet[j][i]) {
					System.out.println(i + " " + j);
				}
				chuaxet[i][j] = chuaxet[j][i] = true;
			}
		}
	}
}
