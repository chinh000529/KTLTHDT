package w3.DsMH;

public class mainMH {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		java.util.ArrayList<MatHang> MHS = new java.util.ArrayList<>();
		for (int i = 1; i<=n; i++) {
			MatHang mh = new MatHang(i, in.nextLine(), in.nextLine(), Long.parseLong(in.nextLine()), Long.parseLong(in.nextLine()));
			MHS.add(mh);
		}

		java.util.Collections.sort(MHS);
		for (MatHang mh : MHS) {
			System.out.println(mh);
		}
	}
}
