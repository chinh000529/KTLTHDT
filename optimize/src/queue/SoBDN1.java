package queue;

public class SoBDN1 {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int t = in.nextInt();
		while (t-->0) {
			long n = in.nextLong();
			xuly(n);
		}
	}

	private static void xuly(long n) {
		java.util.Queue<Long> q = new java.util.LinkedList<>();
		q.add((long) 1); int dem = 0;
		while (q.size()>0) {
			long x = (Long) q.peek();
			if (x > n) break;
			q.poll();
			dem ++;
			q.add(x*10);
			q.add(x*10 + 1);
		}
		System.out.println(dem);
	}
}
