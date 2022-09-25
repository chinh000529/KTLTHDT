package dssinhvien;

import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws ParseException {
		java.util.Scanner in = new java.util.Scanner(System.in);
		java.util.ArrayList<sinhvien> dsArrayList = new java.util.ArrayList<>();
		int n = Integer.parseInt(in.nextLine());
		for (int i = 1; i<=n; i++) {
			sinhvien sv = new sinhvien(i, in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
			dsArrayList.add(sv);
		}
		for (sinhvien sv: dsArrayList)
			System.out.println(sv);
	}
}
