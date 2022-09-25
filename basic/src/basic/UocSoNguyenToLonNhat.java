package basic;

public class UocSoNguyenToLonNhat {
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		long n;
		while(t-->0) {
			n = inScanner.nextLong();
			System.out.println(uoc(n));
		}
	}
	public static boolean nguyento(long n) {
		if (n<2) return false;
		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static long uoc(long n) {
		long x = 1;
		for (int i=1; i<=Math.sqrt(n); i++) {
			if (n%i == 0) {
				if (nguyento(n/i)) return n/i;
				else if (nguyento(i))
					x = i;
			}
		}
		return x;
	}
}
