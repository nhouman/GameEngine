package PartTwo;
import java.util.*;

public class PlayerStats {
	static int gold;
	static int health;
	static int healthMod;
	static String name;
	
	public static int playerHealth(int levels){
		health = 30;
		healthMod = (health*levels) + (1*levels);
		
		if (levels > 1)
			health = health + healthMod;
		return health;
	}
	
	public static String playerName(){
		System.out.println("What is your name, traveler?");
		Scanner in = new Scanner(System.in);
		name = in.nextLine();
		return name;
	}
	
	public static int currency(){
		gold += gold;
		return gold;
	}
	
	public static void inventory() {
		ArrayList <String> inventory =  new ArrayList <String>();
		inventory.add(WeaponGenerator.getWeapon());
	}
	
	public static void display() {
		
	}
}
