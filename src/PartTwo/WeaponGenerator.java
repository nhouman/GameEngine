package PartTwo;
import java.util.*;
public class WeaponGenerator 
{
	private static String[] weapons = new String[] {"Stick", "Dagger", "Sword", "Katana","Recurve Bow", "Crossbow", 
													"Halberd", "Spear", "Revolver", "Double Barrel Shotgun",
													"Novice Staff", "Initiate Staff", "Grand Mage Staff", "Novice Wand", 
													"Initiate Wand", "Grand Mage Wand", "Whip"};
	
	private static String[] effects =  new String[] {"Rusty", "Toxic", "Hot", "Charged", "Frozen", "Striker", "Feeble"};
													//bleed, -dam, poison, burn, lightning, freeze, + damage, -damage, 
	
	public static void randomWeapon()
	{
		Random rand = new Random();
		int i = rand.nextInt(weapons.length);
		
		int j = rand.nextInt(effects.length);
		
		int k = rand.nextInt(5);
		if(k == 4)
			System.out.println(effects[j] + " " + weapons[i]);
		else 
			System.out.println(weapons[i]);
	}
}
