package test3.stack;

public class DauNgoac {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		while (t-->0) {
			String str = in.nextLine();
			xuly(str);
		}
	}

	private static void xuly(String str) {
		java.util.Stack<Character> stack = new java.util.Stack<>();
		int[] a = new int[100001];
		int tt = 0;
		for (int i=0; i<str.length(); i++) {
			if ( str.charAt(i) == '(' ) {
				stack.push(str.charAt(i));
				a[i] = tt + 1;
			}
			else {
				if (stack.empty()) a[i] = tt + 1;;
				char in = stack.peek(), out = str.charAt(i);
				if (in == '(' && out == ')') {
					stack.pop();
					a[i] = tt + 1;
				}
			}
		}
		for (int i=0; i<str.length(); i++) {
			if (a[i] != 0)
				System.out.print(a[i] + " ");
		}
	}
}
