package monsters.models;

public class Watermonster extends Monster {

	public Watermonster(String name) {
		super(name);

	}

	@Override
	public String attack() {
		return "Attack with water!";
	}

}