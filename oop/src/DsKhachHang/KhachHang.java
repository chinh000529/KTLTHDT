package DsKhachHang;

import java.text.ParseException;

public class KhachHang implements Comparable<KhachHang>{
	private String id, ten, gioitinh, diachi;
	private java.util.Date ngaysinh;
	
	public KhachHang(int id, String ten, String gioitinh, String ngaysinh, String diachi) throws ParseException {
		super();
		this.id = "KH" + String.format("%03d", id);
		this.ten = ten;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
		this.ngaysinh = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
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
				+ " " + nameFormat()
				+ " " + gioitinh
				+ " " + diachi
				+ " " + new java.text.SimpleDateFormat("dd/MM/yyyy").format(ngaysinh);
	}

	@Override
	public int compareTo(KhachHang o) {
		return this.ngaysinh.compareTo(o.ngaysinh);
	}
	
}
