package qhd1;

public class BacThang {
	public static void main(String[] args) {
		int mod = (int)1e9+7;
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		while(t-->0) {
			int n = inScanner.nextInt(), k = inScanner.nextInt();
			int f[] = new int[n+5];
			f[0] = 1; f[1] = 1;
			for(int i = 2; i <= n; i++) {
				for (int j = 1; j <= Math.min(i, k); j++) {
					f[i] = (f[i-j] + f[i]) % mod;
				}
			}
			System.out.println(f[n]);
		}
	}
}
