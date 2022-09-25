package sinhvien;

import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws ParseException {
		java.util.Scanner in = new java.util.Scanner(System.in);
		sinhvien sv = new sinhvien(in.nextLine(), in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()));
		System.out.println(sv);
	}
}
