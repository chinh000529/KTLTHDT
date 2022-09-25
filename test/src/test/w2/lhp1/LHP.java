package test.w2.lhp1;

public class LHP implements Comparable<LHP>{
	private String maMH;
	private String tenMH;
	private String nhom;
	private String gv;
	
	public LHP(String maMH, String tenMH, String nhom, String gv) {
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.nhom = nhom;
		this.gv = gv;
	}

	@Override
	public String toString() {
		return nhom + " " + gv;
	}

	public String getTenMH() {
		return tenMH;
	}

	public String getMaMH() {
		return maMH;
	}

	public String getNhom() {
		return nhom;
	}

	public static int compareThem (LHP a, LHP b) {
		return a.nhom.compareTo(b.nhom);
	}

	@Override
	public int compareTo(LHP o) {
		return this.nhom.compareTo(o.nhom);
	}
}
