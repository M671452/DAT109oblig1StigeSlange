package stigespill;

import java.util.Random;

public class Terning {
	
	private Random random = new Random();
	
	public int trill() {
		return random.nextInt(6) + 1;
	}

}
