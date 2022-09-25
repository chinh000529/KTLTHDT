package qhd1;

public class Fibo1 {
	public static void main(String[] args) {
		int n = 40;
		long f[] = new long [100];
		
		for (int i = 1; i <= n; i++) {
			System.out.println(fibo(i));
		}
	}

	private static int fibo(int n) {
		int fibo[] = new int[n+2];
		int i;
		fibo[0] = 0;
		fibo[1] = 1;
		for (i=2; i<=n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		return fibo[n];
	}
}
