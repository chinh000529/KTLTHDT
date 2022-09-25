package basic;

public class fibonacci {
	static int modulo = (int) (1e9+7);
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		int n;
		while(t-->0) {
			n = inScanner.nextInt();
			System.out.println(fiboQHD(n));
		}
	}
	
//	private static int fibo(int n) {
//		if (n == 0) return 0;
//		if (n == 1) return 1;
//		return fibo(n-1) + fibo(n-2);
//	}
	
	public static long fiboQHD(int n) {
		long fibo[] = new long[n+2];
		int i;
		fibo[0] = 0;
		fibo[1] = 1;
		for (i=2; i<=n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		return fibo[n]%modulo;
	}
}
