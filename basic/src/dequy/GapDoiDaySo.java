package dequy;

import java.util.Scanner;

public class GapDoiDaySo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0)
		{
			int n = in.nextInt();
			long k = in.nextLong();
			System.out.println(tinh(n,k));
		}		
	}
	
	public static int tinh(int n,long k)
	{
		long x = (long)Math.pow(2, n-1);
		if(k==x) return n;
		if(k<x) return tinh(n-1,k);
		return tinh(n-1,k-x);
	}
}
