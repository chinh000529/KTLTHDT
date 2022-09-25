package qhd1;

public class DayConTangDaiNhat {
	public static void main(String[] args) {
		java.util.Scanner inScanner = new java.util.Scanner(System.in);
			int n = inScanner.nextInt(), a[] = new int[n];
			for(int i=0; i<n; i++) a[i] = inScanner.nextInt();
			System.out.println(qhd(a,n));
	}
	
	public static int qhd(int s1[], int n) {
		int f[] = new int[n+1], i, j, kq = 0;
		
		for(i=0; i<n; i++) {
			f[i] = 1;
			for(j=0; j<i; j++) {
				if (s1[i] > s1[j])
					f[i] = Math.max(f[i], f[i] + 1);
			}
			kq = Math.max(f[i], kq);
		}
		return kq;
	}
}
