package dssinhvien;

import java.text.ParseException;

public class sinhvien {
	private String ma, ten, lop;
	private java.util.Date dob;
	private float gpa;
	
	public sinhvien(int id, String ten, String lop, String dob, float gpa) throws ParseException {
		this.ma = "B20DCCN" + String.format("%03d", id);
		this.ten = ten;
		this.lop = lop;
		this.dob = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(dob);
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return ma + " " + ten + " " + lop + " " 
				+ new java.text.SimpleDateFormat("dd/MM/yyyy").format(dob)+ " " 
				+ String.format("%.2f", gpa);
	}
	
	
}
