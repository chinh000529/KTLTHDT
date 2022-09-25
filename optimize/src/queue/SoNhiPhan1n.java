package queue;

public class SoNhiPhan1n {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int t = in.nextInt();
		while (t-->0) {
			int n = in.nextInt();
			xuly(n);
		}
	}

	private static void xuly(int n) {
		java.util.Queue<String> q = new java.util.LinkedList<String>();
		q.add("1");
		while (n-->0) {
			String out = (String) q.peek();
			System.out.print(out);
			q.poll();
			q.add(out + "0");
			q.add(out + "1");
			System.out.print(" ");
		}
		System.out.println();
	}
}
