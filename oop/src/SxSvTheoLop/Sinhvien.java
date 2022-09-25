package SxSvTheoLop;

public class Sinhvien {
	private String msv;
	private String hoten;
	private String lop;
	private String email;
	public String getMsv() {
		return msv;
	}
	public String getLop() {
		return lop;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public Sinhvien(String msv, String hoten, String lop, String email) {
		this.msv = msv;
		this.hoten = hoten;
		this.lop = lop;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return msv + " " + hoten + " " + lop + " " + email;
	}
	
}

