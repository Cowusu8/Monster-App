package monsters.models;

public class Firemonster extends Monster {
	public Firemonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with fire!";
	}

}


