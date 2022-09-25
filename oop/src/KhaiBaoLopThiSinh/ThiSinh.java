package KhaiBaoLopThiSinh;

import java.text.ParseException;
import java.util.Date;

public class ThiSinh {
	private String ten;
	private Date ngaysinh;
	private float diem1;
	private float diem2;
	private float diem3;
	
	
	
	public ThiSinh(String ten, String ngaysinh, float diem1, float diem2, float diem3) throws ParseException {
		this.ten = ten;
		this.ngaysinh = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
	}

	public float sum(ThiSinh a) {
		return a.diem1 + a.diem2 + a.diem3;
	}
	
	@Override
	public String toString() {
		return 
				ten 
				+ " " + new java.text.SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
				+ " " + String.format("%.1f", sum(this));
	}
	
	
}
