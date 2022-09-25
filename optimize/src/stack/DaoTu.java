package stack;


public class DaoTu {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		while (t-->0) {
			String s = in.nextLine();
			xuly(s);
		}
	}

	public static void xuly(String s) {
		// TODO Auto-generated method stub
		java.util.Stack<Character> st = new java.util.Stack<>();
		java.util.Scanner in = new java.util.Scanner(s);
		while (in.hasNext()) {
			String tmp = in.next();
			for (int i = 0; i<tmp.length(); i++) {
				if(tmp.charAt(i) != ' ') 
					st.push(tmp.charAt(i));
				else {
					while (!st.empty()) {
						System.out.print(st.peek());
						st.pop();
					}
				}
			}
			while (!st.empty()) {
				System.out.print(st.peek());
				st.pop();
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	
}
