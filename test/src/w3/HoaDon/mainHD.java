package w3.HoaDon;

import java.text.ParseException;

public class mainHD {
	public static void main(String[] args) throws ParseException {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		java.util.ArrayList<MatHang> MHS = new java.util.ArrayList<>();
		java.util.ArrayList<KhachHang> KHS = new java.util.ArrayList<>();
		java.util.ArrayList<HoaDon> HDS = new java.util.ArrayList<>();
		
		int khachNum = Integer.parseInt(in.nextLine());
		for (int i = 1; i<=khachNum; i++) {
			KhachHang kh = new KhachHang(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
			KHS.add(kh);
		}
		
		int hangNum = Integer.parseInt(in.nextLine());
		for (int i = 1; i<=hangNum; i++) {
			MatHang mh = new MatHang(i, in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
			MHS.add(mh);
		}

		int hoadonNum = Integer.parseInt(in.nextLine());
		KhachHang khtmp = new KhachHang();
		MatHang mhtmp = new MatHang();
		for (int i = 1; i<=hoadonNum; i++) {
			String input = in.nextLine();
			String tmp[] = input.split(" ");
			String kh_id = tmp[0];
			String mh_id = tmp[1];
			int soluong = Integer.parseInt(tmp[2]);
			for (KhachHang kh : KHS) {
				if (kh.getId().equalsIgnoreCase(kh_id))
					khtmp = kh;
			}
			for (MatHang mh : MHS) {
				if (mh.getId().equalsIgnoreCase(mh_id))
					mhtmp = mh;
			}
			HoaDon hd = new HoaDon(i, khtmp, mhtmp, soluong);
			HDS.add(hd);
		}
		
		for (HoaDon hd : HDS) {
			System.out.println(hd);
		}
		
	}
}
