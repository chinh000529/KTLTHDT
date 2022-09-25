package TinhGio;

import java.text.ParseException;

public class Gamer implements Comparable<Gamer>{
	private String id, ten;
	private java.util.Date in, out;
	
	public Gamer(String id, String ten, String in, String out) throws ParseException {
		this.id = id;
		this.ten = ten;
		this.in = new java.text.SimpleDateFormat("HH:mm").parse(in);
		this.out = new java.text.SimpleDateFormat("HH:mm").parse(out);
	}

	public String duration () {
		String duration = "";
		long milisec = out.getTime() - in.getTime();
		long hour = milisec / (60*60*1000) % 24;
		long minute = milisec /(60*1000) % 60;
		duration = hour + " " + "gio" + " " + minute + " " + "phut";
		return duration;
	}
	
	public long getDuration() {
		return out.getTime() - in.getTime();
	}
	
	@Override
	public String toString() {
		return 
				id
				+ " " + ten
				+ " " + this.duration();
	}

	@Override
	public int compareTo(Gamer o) {
		return - Long.compare(this.getDuration(), o.getDuration());
	}
	
	
}
