package stack;


public class KiemTraCauVietDung {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		while (t-->0) {
			String s = in.nextLine();
			if (check(s)) System.out.println("YES");
			else System.out.println("NO");
		}
	}

	public static boolean check(String s) {
		java.util.Stack<Character> st = new java.util.Stack<>();
		if (s.charAt(s.length() - 1) != '.') return false;
		for (int i=0; i<s.length()-1; i++) {
			if (	s.charAt(i) == '(' || 
					s.charAt(i) == '{' 
			) {
				st.push(s.charAt(i));
			}
			else if ( s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ||
				 s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || 
				 s.charAt(i) == ' ') {
				st.push(s.charAt(i));
			}
			else {
				if (st.empty()) return false;
				char in = st.peek(), out = s.charAt(i);
				if (in == '(' && out == ')') st.pop();
				else if (in == '[' && out == ']') st.pop();
				else return false;
			}
		}
		return true;
	}
}
