package KhaiBaoLopNhanVien;

import java.text.ParseException;

public class NhanVien {
	private String id, ten, gioitinh, diachi, msthue;
	private java.util.Date ngaysinh, ngayky;
	
	public NhanVien(String ten, String gioitinh, String ngaysinh, String diachi, String msthue, String ngayky) throws ParseException {
		this.id = "00001";
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.msthue = msthue;
		this.ngaysinh = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
		this.ngayky = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(ngayky);
	}

	@Override
	public String toString() {
		return 
				id
				+ " " + ten
				+ " " + gioitinh
				+ " " + new java.text.SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
				+ " " + diachi
				+ " " + msthue
				+ " " + new java.text.SimpleDateFormat("dd/MM/yyyy").format(ngayky);
	}
	
}
