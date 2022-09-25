package qhd1;

public class XauConChungDaiNhat {
	static int c[][] = new int[1005][1005];
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		while (t-->0) {
			char s1[] = inScanner.next().toCharArray();
			char s2[] = inScanner.next().toCharArray();
			System.out.println(qhd(s1,s2));
		}
	}
	
	public static int qhd(char s1[], char s2[]) {
		int n = s1.length, m = s2.length;

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if (s1[i-1] == s2[j-1])
					c[i][j] = c[i-1][j-1]+1;
				else {
					c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
				}
			}
		}
		return c[n][m];
	}
}
