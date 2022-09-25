package ThuNhapGiaoVien;

public class mainGV {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		GiaoVien gv = new GiaoVien(in.nextLine(), in.nextLine(), in.nextLong());
		System.out.println(gv.toString());
	}
}
