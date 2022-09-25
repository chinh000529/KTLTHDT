package dequy;

public class HoanVi {
	
	static int n, a[] = new int [15];
	static boolean b[] = new boolean[15];
	
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		n = inScanner.nextInt();
		quaylui(1);
	}
	
	public static void quaylui(int i) {
		int j;
		for (j = 1; j <= n; j ++) {
			if (b[j] == false) {
				a[i] = j; b[j] = true;
				if (i == n) in();
				else quaylui(i+1);
				b[j] = false;
			}
		}
	}
	
	public static void in() {
		for (int i=1; i<=n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
