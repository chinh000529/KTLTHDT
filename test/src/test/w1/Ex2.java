package test.w1;

public class Ex2 {
	static int c[] = new int[30], n=0, k=0;
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		n = scanner.nextInt(); k = scanner.nextInt();
		for(int i=1; i<=n; i++) {
			c[i] = scanner.nextInt();
		}
		backtrack(1);
	}
	public static void backtrack(int i) {
		for (int j = c[i-1]+1; j<=n-k+i; j++) {
			c[i] = j;
			if (i==k) {
				show();
			}
			else {
				backtrack(i+1);
			}
		}
	}
	public static void show() {
		for (int i=1; i<=k; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
	}
}
