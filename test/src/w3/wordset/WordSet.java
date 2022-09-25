package w3.wordset;

import java.util.TreeSet;

public class WordSet {
	private java.util.TreeSet<String> set = new java.util.TreeSet<>();

	public WordSet(java.util.Scanner in) {
		java.util.StringTokenizer tokens = new java.util.StringTokenizer("s");
		while (tokens.hasMoreTokens()) {
			if (set.contains(tokens.nextToken())) {
				tokens.nextToken();
			}
			set.add(tokens.nextToken());
		}
	}
	
	public String toString () {
		String kq = "";
		for (String i:set) {
			kq = kq + i + "\n";
		}
		return kq.trim();
	}
	
}
