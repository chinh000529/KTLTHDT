package finalTest.SxLichThi;

public class LichThi implements Comparable<LichThi>{
	public MonHoc monHoc;
	public CaThi caThi;
	public String nhomLop;
	public int soSv;
	
	public LichThi(MonHoc monHoc, CaThi caThi, String nhomLop, int soSv) {
		this.monHoc = monHoc;
		this.caThi = caThi;
		this.nhomLop = nhomLop;
		this.soSv = soSv;
	}

	@Override
	public String toString() {
		return 
				new java.text.SimpleDateFormat("dd/MM/yyyy").format(caThi.getNgayThi()) + " " + 
				new java.text.SimpleDateFormat("HH:mm").format(caThi.getGioThi()) + " " + 
				caThi.getPhongThi() + " " + 
				monHoc.getTenMon() + " " + 
				nhomLop + " " + 
				soSv;
	}
	
	@Override
	public int compareTo(LichThi o) {
		long t1 = this.caThi.getNgayThi().getTime() + this.caThi.getGioThi().getTime();
		long t2 = o.caThi.getNgayThi().getTime() + o.caThi.getGioThi().getTime();
		if (t1 == t2) {
			return Long.compare(this.caThi.getPhongThi(), o.caThi.getPhongThi());
		}
		return Long.compare(t1, t2);
	}
}
