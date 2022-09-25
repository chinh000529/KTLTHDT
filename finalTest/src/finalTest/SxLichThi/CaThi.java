package finalTest.SxLichThi;

import java.text.ParseException;
import java.util.Date;

public class CaThi{
	private String maCaThi;
	private java.util.Date ngayThi;
	private java.util.Date gioThi;
	private Long phongThi;
	
	public CaThi(int id, String ngayThi, String gioThi, Long phongThi) throws ParseException {
		this.maCaThi = "C0" + String.format("%02d", id);
		this.ngayThi = new java.text.SimpleDateFormat("dd/MM/yyyy").parse(ngayThi);
		this.gioThi = new java.text.SimpleDateFormat("HH:mm").parse(gioThi);
		this.phongThi = phongThi;
	}

	public CaThi() {
	}

	public String getMaCaThi() {
		return maCaThi;
	}

	public void setMaCaThi(String maCaThi) {
		this.maCaThi = maCaThi;
	}

	public java.util.Date getNgayThi() {
		return ngayThi;
	}

	public void setNgayThi(java.util.Date ngayThi) {
		this.ngayThi = ngayThi;
	}

	public java.util.Date getGioThi() {
		return gioThi;
	}

	public void setGioThi(java.util.Date gioThi) {
		this.gioThi = gioThi;
	}

	public Long getPhongThi() {
		return phongThi;
	}

	public void setPhongThi(Long phongThi) {
		this.phongThi = phongThi;
	}
	
	
}
