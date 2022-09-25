package DsKhachHang;

import java.text.ParseException;


public class mainKh {
	public static void main(String[] args) throws ParseException {
		java.util.Scanner in = new java.util.Scanner(System.in);
		java.util.ArrayList<KhachHang> dsArrayList = new java.util.ArrayList<>();
		int n = Integer.parseInt(in.nextLine());
		for (int i = 1; i<=n; i++) {
			KhachHang sv = new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
			dsArrayList.add(sv);
		}
		java.util.Collections.sort(dsArrayList);
		for (KhachHang sv: dsArrayList)
			System.out.println(sv);
	}
}
