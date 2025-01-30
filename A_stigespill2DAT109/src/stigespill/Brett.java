package stigespill;

import java.util.ArrayList;
import java.util.List;

public class Brett {
	private List<Rute> ruter = new ArrayList<>();

	public Brett() {
		ruter.add(new Rute(16, 6));
		ruter.add(new Rute(47, 26));
		ruter.add(new Rute(49, 11));
		ruter.add(new Rute(56, 53));
		ruter.add(new Rute(62, 19));
		ruter.add(new Rute(64, 60));
		ruter.add(new Rute(87, 24));
		ruter.add(new Rute(93, 73));
		ruter.add(new Rute(95, 75));
		ruter.add(new Rute(98, 78));
		ruter.add(new Rute(2, 38));
		ruter.add(new Rute(7, 14));
		ruter.add(new Rute(8, 31));
		ruter.add(new Rute(15, 26));
		ruter.add(new Rute(21, 82));
		ruter.add(new Rute(28, 84));
		ruter.add(new Rute(36, 44));
		ruter.add(new Rute(51, 67));
		ruter.add(new Rute(71, 91));
		ruter.add(new Rute(78, 98));
	}

	public int getNyPosisjon(int posisjon) {
		for (Rute rute : ruter) {
			if (rute.getStart() == posisjon) {
				if (rute.erStige()) {
					System.out.println("🪜 Stige! Flytter fra " + posisjon + " til " + rute.getSlutt());
				} else if (rute.erSlange()) {
					System.out.println("🐍 Slange! Sklir fra " + posisjon + " til " + rute.getSlutt());
				}
				return rute.getSlutt();
			}
		}
		return posisjon;
	}
}