package sxnhanvien;

import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws ParseException {
		java.util.Scanner in = new java.util.Scanner(System.in);
		java.util.ArrayList<nhanvien> dsArrayList = new java.util.ArrayList<>();
		int n = Integer.parseInt(in.nextLine());
		for (int i = 1; i<=n; i++) {
			nhanvien sv = new nhanvien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(),in.nextLine(),in.nextLine());
			dsArrayList.add(sv);
		}
//		java.util.Collections.sort(dsArrayList);
		for (nhanvien sv: dsArrayList)
			System.out.println(sv);
	}
}
