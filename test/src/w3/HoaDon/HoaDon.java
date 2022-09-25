package w3.HoaDon;

public class HoaDon {
	private String id;
	private KhachHang KH;
	private MatHang MH;
	private int soluong;
	
	public HoaDon(int id, KhachHang kh, MatHang mh, int soluong) {
		this.id = "HD" + String.format("%03d", id);
		this.KH = kh;
		this.MH = mh;
		this.soluong = soluong;
	}

	@Override
	public String toString() {
		return 
				id
				+ " " + KH.nameFormat()
				+ " " + KH.getDiachi()
				+ " " + MH.getTen()
				+ " " + MH.getDonvi()
				+ " " + MH.getGiamua()
				+ " " + MH.getGiaban()
				+ " " + soluong
				+ " " + soluong*MH.getGiaban();
	}
	
	
}
