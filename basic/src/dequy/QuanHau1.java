package dequy;

public class QuanHau1 {
	
	static int n, count, a[] = new int [15];
	static boolean b[] = new boolean[15], xuoi[] = new boolean [21];
	static boolean[] nguoc = new boolean [21];
	
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
		int t = inScanner.nextInt();
		while (t-->0) {
			n = inScanner.nextInt();
			a= new int [15]; b = new boolean[15]; xuoi = new boolean[21]; nguoc = new boolean[21];
			count = 0;
			quaylui(1);
			System.out.println(count);
		}
	}
	
	public static void quaylui(int i) {
		int j;
		for (j = n; j >= 1; j--) {
			if (!b[j] && !xuoi[i-j+n] && !nguoc[i+j-1]) {
				a[i] = j; 
				b[j] = true; xuoi[i-j+n] = true; nguoc[i+j-1] = true;
				if (i == n) count++;
				else quaylui(i+1);
				b[j] = false; xuoi[i-j+n] = false; nguoc[i+j-1] = false;
			}
		}
	}
}
