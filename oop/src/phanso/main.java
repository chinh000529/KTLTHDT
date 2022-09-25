package phanso;

public class main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		phanso p = new phanso(in.nextLong(), in.nextLong());
		p.rutgon();
		System.out.println(p);
	}
}
