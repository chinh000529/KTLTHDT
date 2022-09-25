package dequy;

public class HoanViXau {
	
	static int n, a[] = new int [15];
	static boolean b[] = new boolean[15];
	static String string;
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		inScanner.nextLine();
		while (t-->0) {
			a= new int [15]; string = inScanner.nextLine(); n = string.length();
			quaylui(1);
			System.out.println();
		}
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
			System.out.print(string.charAt(a[i]-1));
		}
		System.out.print(" ");
	}
}
