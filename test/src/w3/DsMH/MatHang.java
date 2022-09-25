package w3.DsMH;

public class MatHang implements Comparable<MatHang>{
	private String id, ten, donvi;
	private long giamua, giaban;
	
	public MatHang(int id, String ten, String donvi, long giamua, long giaban) {
		this.id = "MH" + String.format("%03d", id);
		this.ten = ten;
		this.donvi = donvi;
		this.giamua = giamua;
		this.giaban = giaban;
	}

	public long benefit () {
		return giaban - giamua;
	}
	
	@Override
	public String toString() {
		return 
				id
				+ " " + ten
				+ " " + donvi
				+ " " + giamua
				+ " " + giaban
				+ " " + this.benefit();
	}

	@Override
	public int compareTo(MatHang o) {
		if (this.benefit() == o.benefit())
			return this.id.compareTo(o.id);
		return - Long.compare(this.benefit(), o.benefit());
	}
	
}
