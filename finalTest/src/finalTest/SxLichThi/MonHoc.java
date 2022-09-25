package finalTest.SxLichThi;

public class MonHoc{
	private String maMon;
	private String tenMon;
	private String hinhThuc;
	
	public MonHoc(String maMon, String tenMon, String hinhThuc) {
		this.maMon = maMon;
		this.tenMon = tenMon;
		this.hinhThuc = hinhThuc;
	}

	public MonHoc() {
	}

	public String getMaMon() {
		return maMon;
	}

	public void setMaMon(String maMon) {
		this.maMon = maMon;
	}

	public String getTenMon() {
		return tenMon;
	}

	public void setTenMon(String tenMon) {
		this.tenMon = tenMon;
	}

	public String getHinhThuc() {
		return hinhThuc;
	}

	public void setHinhThuc(String hinhThuc) {
		this.hinhThuc = hinhThuc;
	}

}
