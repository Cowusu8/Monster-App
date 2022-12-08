package monsters.models;

public class Stonemonster extends Monster {

	public Stonemonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with stones!";
	}

}