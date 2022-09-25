package LopPhanSo;

import java.util.StringTokenizer;

public class PhanSo {
	private long tu;
	private long mau;
	
	public PhanSo() {
		
	}
	@Override
	public String toString()
	{
		return tu+"/"+mau;
	}
	
	public long getTu() {
		return tu;
	}

	public long getMau() {
		return mau;
	}

	public void setTu(long tu) {
		this.tu = tu;
	}

	public void setMau(long mau) {
		this.mau = mau;
	}

	public PhanSo(String ps) {
		StringTokenizer s = new StringTokenizer(ps," ");
		this.tu = Long.parseLong(s.nextToken());
		this.mau = Long.parseLong(s.nextToken());
	}
	
	public PhanSo cong(PhanSo X) {
		long _tu = 0;
		long _mau = 0;
		_tu = this.getTu()*X.getMau() + X.getTu()*this.getMau();
		_mau = this.getMau()*X.getMau();
		PhanSo C = new PhanSo();
		C.setMau(_mau);
		C.setTu(_tu);
		C.rutGon();
		return C;
	}
	
	public PhanSo nhan(PhanSo X) {
		long _tu = 1;
		long _mau = 1;
		_tu = this.getTu()*X.getTu();
		_mau = this.getMau()*X.getMau();
		PhanSo C = new PhanSo();
		C.setMau(_mau);
		C.setTu(_tu);
		C.rutGon();
		return C;
	}
	
	private void rutGon() {
		long t = ucln(tu, mau);
		tu /= t;
		mau /= t;
		
	}
	
	private long ucln(long a, long b) {
		if(b==0) return a;
		return ucln(b, a%b);
	}
}