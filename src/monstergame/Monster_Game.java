package monstergame;
import monsters.models.Firemonster;
import monsters.models.Monster;
import monsters.models.Stonemonster;
import monsters.models.Watermonster;

public class Monster_Game {
	
	 public static void main(String[] args) {
	      // Program at the "interface" defined in the superclass.
	      // Declare instances of the superclass, substituted by subclasses.
			Monster m1 = new Firemonster("r2u2"); // upcast
			Monster m2 = new Watermonster("u2r2"); // upcast
			Monster m3 = new Stonemonster("r2r2"); // upcast
	 
	      // Invoke the actual implementation
	      System.out.println(m1.attack());  // Run FireMonster's attack()
	      System.out.println(m2.attack());  // Run WaterMonster's attack()
	      System.out.println(m3.attack());  // Run StoneMonster's attack()
	 
	      // m1 dies, generate a new instance and re-assign to m1.
			m1 = new Stonemonster("a2b2"); // upcast
	      System.out.println(m1.attack());  // Run StoneMonster's attack()
	 
	      // We have a problem here!!!
	      Monster m4 = new Monster("u2u2");
	      System.out.println(m4.attack());  // garbage!!!
	 }
}