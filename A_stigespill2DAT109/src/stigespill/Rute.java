package stigespill;

public class Rute {
	private int start;
	private int slutt;

	public Rute(int start, int slutt) {
		this.start = start;
		this.slutt = slutt;
	}

	public int getStart() {
		return start;
	}

	public int getSlutt() {
		return slutt;
	}

	public boolean erStige() {
		return slutt > start;
	}

	public boolean erSlange() {
		return slutt < start;
	}
}
