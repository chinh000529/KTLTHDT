package SxSvTheoLop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Sinhvien> ds = new ArrayList<Sinhvien>();
		int t = Integer.parseInt(in.nextLine());
		while(t-->0) {
			Sinhvien sv = new Sinhvien(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
			ds.add(sv);
		}
		
		Collections.sort(ds, new Comparator<Sinhvien>() {
			public int compare(Sinhvien sv1, Sinhvien sv2) {
				if(sv1.getLop().equals(sv2.getLop())) {
					return sv1.getMsv().compareTo(sv2.getMsv());
				}
				return sv1.getLop().compareTo(sv2.getLop());
			}
		});
		
		for(Sinhvien i : ds) {
			System.out.println(i.toString());
		}
	}
}

