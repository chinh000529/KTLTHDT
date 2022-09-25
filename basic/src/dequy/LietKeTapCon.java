package dequy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LietKeTapCon {
	static int n = 0, b[] = new int[30];
	static String xau = "";
	static ArrayList<String> ketqua = new ArrayList<>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0)
		{
			ketqua = new ArrayList<>();
			n = in.nextInt();	
			xau = in.next();
			quayLui(1);
			Collections.sort(ketqua);
			for(int i=1;i<ketqua.size();i++)
			{
				System.out.print(ketqua.get(i) + " ");
			}
			System.out.println();
			
		}
	}
	
	public static void quayLui(int i)
	{
		String daycon = "";
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
		for(int i = 1;i<=n;i++)
		{
			if(b[i]==1)
			{
				daycon = daycon + xau.charAt(i-1) + "";
			}
		}
		ketqua.add(daycon);
	}
}
