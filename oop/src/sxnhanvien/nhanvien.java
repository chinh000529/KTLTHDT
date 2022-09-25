package sxnhanvien;

import java.text.ParseException;

public class nhanvien implements Comparable<nhanvien>{
	private String ma, ten, gioitinh, diachi, msthue;
	private java.util.Date dob, ngayky;
	
	public nhanvien(int id, String ten, String gioitinh, String dob, String diachi, String msthue, String ngayky) throws ParseException {
		super();
		this.ma = String.format("%05d", id);
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.msthue = msthue;
		this.dob = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(dob);
		this.ngayky = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(ngayky);
	}

	@Override
	public String toString() {
		return  ma + " " 
				+ ten + " " + gioitinh + " " 
				+ new java.text.SimpleDateFormat("dd/MM/yyyy").format(dob) + " "
				+ diachi + " " + msthue + " " 
				+ new java.text.SimpleDateFormat("dd/MM/yyyy").format(ngayky);
	}

	@Override
	public int compareTo(nhanvien o) {
		// TODO Auto-generated method stub
		return this.dob.compareTo(o.dob);
	}
	
	
	
	
}
