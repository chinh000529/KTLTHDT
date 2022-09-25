package stack;
import java.util.*;
public class BieuThucDung {
	static Stack<Character> s = new Stack<>();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		while(t-->0) {
			String xau = in.nextLine();
			xuly(xau);
		}
	}
	
	public static void xuly(String xau) {
		int dem = 0;
		int xoa = 0;
		for(int i=0; i<xau.length();i++) {
			if(s.size() == 0)
			{
				xoa = 0;
				s.push(xau.charAt(i));
			}
			else {
				Character _s = s.peek();
				if(_s=='[' && xau.charAt(i)==']') {
					s.pop();
					xoa=xoa+2;
				}
				else if(_s==']' && xau.charAt(i)=='[') {
					dem = dem + s.size() + xoa;
					s.pop();
				}
				else {
					s.push(xau.charAt(i));
				}
			}						
		}
		while(s.size() > 0) {
			s.pop();
		}
		System.out.println(dem);
	}
}
