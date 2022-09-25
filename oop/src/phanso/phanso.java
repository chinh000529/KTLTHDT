package phanso;

public class phanso {
	private long tu, mau;

	public phanso(long tu, long mau) {
		super();
		this.tu = tu;
		this.mau = mau;
	}

	@Override
	public String toString() {
		return tu + "/" + mau ;
	}
	
	public void rutgon() {
		long x = uoc(tu,mau);
		tu/=x;
		mau/=x;
	}

	private long uoc(long a, long b) {
		long t;
		while (b>0) {
			t = a%b;
			a = b; b = t;
		}
		return a;
	}
	
}
