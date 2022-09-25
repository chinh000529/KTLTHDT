package KhaiBaoLopNhanVien;

import java.text.ParseException;

public class mainNV {
	public static void main(String[] args) throws ParseException {
		java.util.Scanner in = new java.util.Scanner(System.in);
		NhanVien nv = new NhanVien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
		System.out.println(nv.toString());
	}
}
