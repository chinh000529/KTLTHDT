package qhd1;

public class DayConLapLai {
	static int c[][];
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		while (t-->0) {
			int n = inScanner.nextInt();
			char s[] = inScanner.next().toCharArray();
			System.out.println(qhd(s,n));
		}
	}
	
	public static int qhd(char s1[], int n) {
		c = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if (s1[i-1] == s1[j-1] && i!=j)
					c[i][j] = c[i-1][j-1]+1;
				else {
					c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
				}
			}
		}
		return c[n][n];
	}
}
