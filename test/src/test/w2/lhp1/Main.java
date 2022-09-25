package test.w2.lhp1;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		java.util.ArrayList<LHP> nlhp = new java.util.ArrayList<>();
		while (n-- > 0) {
			LHP lhpx = new LHP(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			nlhp.add(lhpx);
		}
		int m = Integer.parseInt(sc.nextLine());
		while (m-- > 0) {
			
			String in = sc.nextLine();
			java.util.ArrayList<LHP> rs = new java.util.ArrayList<>();
			
			for (LHP i : nlhp)
				if (i.getMaMH().equals(in)) {
					rs.add(i);
				}
			if (!rs.isEmpty())
				System.out.println("Danh sach nhom lop mon " + rs.get(0).getTenMH() + ":");
			java.util.Collections.sort(rs);
			for (LHP i : rs)
				System.out.println(i);
		}
	}
}
