package SinhVien2;

import java.text.ParseException;

public class mainSv {
	public static void main(String[] args) throws ParseException {
		java.util.Scanner in = new java.util.Scanner(System.in);
		java.util.ArrayList<SinhVien2> dsArrayList = new java.util.ArrayList<>();
		int n = Integer.parseInt(in.nextLine());
		for (int i = 1; i<=n; i++) {
			SinhVien2 sv = new SinhVien2(i, in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
			dsArrayList.add(sv);
		}
		for (SinhVien2 sv: dsArrayList)
			System.out.println(sv);
	}
	
}
