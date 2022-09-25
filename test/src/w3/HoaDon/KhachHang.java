package w3.HoaDon;

import java.text.ParseException;

public class KhachHang {
	
	private String id, ten, gioitinh, diachi;
	private java.util.Date ngaysinh;

	public KhachHang(int id, String ten, String gioitinh, String ngaysinh, String diachi) throws ParseException {
		this.id = "KH" + String.format("%03d", id);
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.ngaysinh = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
		this.diachi = diachi;
	}

	public KhachHang() {

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public String getDiachi() {
		return diachi;
	}

}
