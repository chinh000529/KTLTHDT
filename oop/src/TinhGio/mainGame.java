package TinhGio;

import java.text.ParseException;

public class mainGame {
	public static void main(String[] args) throws ParseException {
		java.util.Scanner in = new java.util.Scanner(System.in);
		java.util.ArrayList<Gamer> gamers = new java.util.ArrayList<>();
		int n = Integer.parseInt(in.nextLine());
		for (int i=1; i<=n; i++) {
			Gamer gamer = new Gamer(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
			gamers.add(gamer);
		}
		java.util.Collections.sort(gamers);
		for (Gamer gamer : gamers) {
			System.out.println(gamer);
		}
	}
}
