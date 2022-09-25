package finalTest.SxLichThi;

import java.text.ParseException;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		java.util.List<MonHoc> monHocS = new java.util.ArrayList<>();
		java.util.List<CaThi> caThiS = new java.util.ArrayList<>();
		java.util.List<LichThi> LichThiS = new java.util.ArrayList<>();
		
		int mh_num = Integer.parseInt(in.nextLine());
		for (int i = 1; i<=mh_num; i++) {
			MonHoc mh = new MonHoc(in.nextLine(), in.nextLine(), in.nextLine());
			monHocS.add(mh);
		}
		
		int ct_num = Integer.parseInt(in.nextLine());
		for (int i = 1; i<=ct_num; i++) {
			CaThi ct = new CaThi(i, in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()));
			caThiS.add(ct);
		}
		
		int lt_num = Integer.parseInt(in.nextLine());
		MonHoc mhtm = new MonHoc();
		CaThi cttm = new CaThi();
		for (int i = 1; i<=lt_num; i++) {
			String input = in.nextLine();
			String tmp[] = input.split(" ");
			String mh_id = tmp[1], ct_id = tmp[0], nhom = tmp[2];
			int soSv = Integer.parseInt(tmp[3]);
			
			for (MonHoc mh : monHocS) {
				if (mh.getMaMon().equalsIgnoreCase(mh_id)) {
					mhtm = mh;
				}
			}
			for (CaThi ct : caThiS) {
				if (ct.getMaCaThi().equalsIgnoreCase(ct_id)) {
					cttm = ct;
				}
			}
			
			LichThi lichThi = new LichThi(mhtm, cttm, nhom, soSv);
			LichThiS.add(lichThi);
		}
		
//		Collections.sort(LichThiS, new Comparator<LichThi>() {
//			public int compare(LichThi sv1, LichThi sv2) {
//				long t1 = sv1.caThi.getGioThi().getTime() + sv1.caThi.getGioThi().getTime();
//				long t2 = sv2.caThi.getGioThi().getTime() + sv2.caThi.getGioThi().getTime();
//				if(t1 != t2) {
//					return Long.compare(t1, t2);
//				}
//				return Long.compare(sv1.caThi.getPhongThi(), sv2.caThi.getPhongThi());
//			}
//		});
		
		
		java.util.Collections.sort(LichThiS);
		
		for (LichThi lt : LichThiS) {
			System.out.println(lt);
		}
	}
}
