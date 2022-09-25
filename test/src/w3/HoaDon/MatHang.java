package w3.HoaDon;

public class MatHang{
	private String id, ten, donvi;
	private long giamua, giaban;
	
	public MatHang(int id, String ten, String donvi, long giamua, long giaban) {
		this.id = "MH" + String.format("%03d", id);
		this.ten = ten;
		this.donvi = donvi;
		this.giamua = giamua;
		this.giaban = giaban;
	}

	public MatHang() {
		// TODO Auto-generated constructor stub
	}

	public String getTen() {
		return ten;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDonvi() {
		return donvi;
	}

	public void setDonvi(String donvi) {
		this.donvi = donvi;
	}

	public long getGiamua() {
		return giamua;
	}

	public void setGiamua(long giamua) {
		this.giamua = giamua;
	}

	public long getGiaban() {
		return giaban;
	}

	public void setGiaban(long giaban) {
		this.giaban = giaban;
	}


}
