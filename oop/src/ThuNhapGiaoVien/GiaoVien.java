package ThuNhapGiaoVien;

public class GiaoVien {
	private String code, ten;
	private long base;
	
	public GiaoVien(String code, String ten, long base) {
		super();
		this.code = code;
		this.ten = ten;
		this.base = base;
	}
	
	public int getLevel (GiaoVien a) {
		return Integer.parseInt(a.code.substring(2));
	}
	
	public int getGrant (GiaoVien a) {
		String grant = a.code.substring(0,2);
		if (grant.equals("HT")) return 2000000;
		if (grant.equals("HP")) return 900000;
		return 500000;
	}
	
	@Override
	public String toString() {
		return
				code
				+ " " + ten
				+ " " + getLevel(this)
				+ " " + getGrant(this)
				+ " " + (base*getLevel(this)+getGrant(this));
	}
	
	
}
