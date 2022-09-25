package KhaiBaoLopThiSinh;

import java.text.ParseException;

public class mainKBTS {
	public static void main(String[] args) throws ParseException {
		java.util.Scanner in = new java.util.Scanner(System.in);
		ThiSinh ts = new ThiSinh(in.nextLine(), in.nextLine(), in.nextFloat(), in.nextFloat(), in.nextFloat());
		System.out.println(ts.toString());
	}
}
