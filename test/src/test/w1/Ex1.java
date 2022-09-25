package test.w1;

public class Ex1 {
	static int mod = (int) (1e9+7);
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int a;
		long b;
		while (true) {
			a = scanner.nextInt(); b = scanner.nextLong();
//			if (a == 0 && b == 0) return;
			
			System.out.println(solve(a, b));
		}
	}
	
	public static long solve(int a, long b) {
		if (b == 0) return 1;
		long x = solve(a,b/2);
		if (b%2 == 0) return x*x%mod;
		return a*(x*x%mod);
	}
}




