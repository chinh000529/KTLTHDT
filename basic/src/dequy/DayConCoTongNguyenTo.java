package dequy;

import java.util.ArrayList;
import java.util.Scanner;

public class DayConCoTongNguyenTo {
	static int n, b[] = new int[30];
	static String ketqua = "";
	static ArrayList<Integer> dayso = new ArrayList<>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0)
		{
			ketqua = "";
			dayso.clear();
			n = in.nextInt();
			for(int i=1;i<=n;i++)
			{
				dayso.add(in.nextInt());
			}
			dayso.sort((o1, o2) -> o2 - o1);
			quayLui(1);
		}
	}
	
	public static void quayLui(int i)
	{
		for(int j=0;j<=1;j++)
		{
			b[i] = j;
			if(i==n)
			{
				xuLy();
			}
			else
			{
				quayLui(i+1);
			}
		}
	}
	
	public static void xuLy()
	{
		String daycon = "";
		int tong = 0;
		for(int i = 1;i<=n;i++)
		{
			if(b[i]==1)
			{
				tong = tong + dayso.get(i-1);
				daycon = daycon + dayso.get(i-1) + " ";
			}
		}
		if(ktNguyento(tong))
		{
			System.out.println(daycon.trim());
		}
	}
	
	public static boolean ktNguyento(int n)
	{
	    if (n < 2){
	        return false;
	    }       
	     
	    for (int i = 2; i < (n - 1); i++){
	        if (n % i == 0){
	            return false;
	        }   
	    }	     
	    return true;
	}
}
