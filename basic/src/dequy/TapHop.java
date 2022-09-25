package dequy;

import java.util.Scanner;

public class TapHop {
	static int n, k, s, c[] = new int[50], count;
	
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		while (true) {
			n = inScanner.nextInt(); k = inScanner.nextInt(); s = inScanner.nextInt();
			if (n==0 && k==0 && s==0) break;
			count = 0;
			quaylui(1);
			System.out.println(count);
		}
	}

	private static void quaylui(int i) {
		// TODO Auto-generated method stub
		int j; 
		for (j = c[i-1]+1; j <= n-k+i; j++) {
			c[i] = j;
			if (i == k) {
				in();
			} else quaylui(i+1);
		}
	}
	
	public static void in() {
		int t = 0;
		for (int i = 1; i <= k; i++)
			t+=c[i];
		if (t == s) {
			count ++ ;
		}
	}
}
