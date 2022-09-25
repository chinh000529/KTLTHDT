package SinhVien2;

import java.text.ParseException;

public class SinhVien2 {
	private String id, ten, lop;
	private java.util.Date ngaysinh;
	private float gpa;
	
	public SinhVien2(int a, String ten, String lop, String ngaysinh, float gpa) throws ParseException {
		this.id = "B20DCCN" + String.format("%03d", a);
		this.ten = ten;
		this.lop = lop;
		this.ngaysinh = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
		this.gpa = gpa;
	}
	
	public String nameFormat() {
		java.util.StringTokenizer tmp = new java.util.StringTokenizer(ten);
		String formated = "";
		while (tmp.hasMoreTokens()) {
			String word = tmp.nextToken();
			String lower = word.toLowerCase();
			formated = formated 
						+ lower.toUpperCase().charAt(0) 
						+ lower.substring(1,lower.length())
						+ " ";
		}
		return formated;
	}

	@Override
	public String toString() {
		return 
				id
				+ " " + this.nameFormat()
				+ " " + lop
				+ " " + new java.text.SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
				+ " " + String.format("%.2f", gpa);
	}
	
	
}
