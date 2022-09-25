package w3.wordset;

public class WordSet2 {
	private java.util.TreeSet<String> set = new java.util.TreeSet<>();

	public WordSet2(java.util.Scanner in) {
		while (in.hasNext()) {
			set.add(in.next().toLowerCase());
		}
	}
	
	public String toString() {
		String kq = "";
		for(String s : set) kq = kq + s + "\n";
		return kq;
	}
}
