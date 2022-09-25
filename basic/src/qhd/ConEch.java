package qhd1;

public class ConEch {
	public static void main(String[] args) {
		long f[] = new long[55];
		f[1]=1; f[2]=2; f[3]=4;
		for (int i = 4; i <= 50; i++) {
			f[i] = f[i-1] + f[i-2] + f[i-3];
		}
		
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		while (t-->0) {
			int n = inScanner.nextInt();
			System.out.println(f[n]);
		}
	}
}
