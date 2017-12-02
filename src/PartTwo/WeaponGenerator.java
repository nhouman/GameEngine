package PartTwo;
import java.util.*;
public class WeaponGenerator 
{
	private static String[] weapons = new String[] {"Dagger", "Sword", "Katana","Recurve Bow", "Crossbow", 
													"Halberd", "Spear", "Revolver", "Double Barrel Shotgun",
													"Novice Staff", "Initiate Staff", "Grand Mage Staff", "Novice Wand", 
													"Initiate Wand", "Grand Wizard Wand", "Whip"};
	
	private static String[] effects =  new String[] {"Rusty", "Toxic", "Hot", "Charged", "Frozen", "Striker", "Feeble"};
													//bleed + -dam, poison, burn, lightning, freeze, + damage, -damage, 
	
	public static void randomWeapon()
	{
		Random rand = new Random();	
		int i = rand.nextInt(weapons.length);
		int k = rand.nextInt(5);		//gets random num  0 - 4
		if(k == 4)			//if num = 4, add effect
		{
			int j = rand.nextInt(effects.length);		//gets random effect
			System.out.println(effects[j] + " " + weapons[i]);
			wDescription(i);
			eDescription(j);
		}
		else 		//else no effect
		{
			System.out.println(weapons[i]);	
			wDescription(i);
		
		}
	}
	
	
	public static void wDescription(int i)
	{
		String description = "";
		
		switch(weapons[i].toUpperCase())
		{
		case "DAGGER":
			description = "A small double edged blade, could be useful.";
			break;
		case "SWORD":
			description = "A large double edged blade. You don't want to be on the pokey end of this.";
			break;
		case "KATANA":
			description = "A large curved blade. I can be a samurai now.";
			break;
		case "RECURVE BOW":
			description = "A pretty basic bow but everything has to start somewhere.";
			break;
		case "CROSSBOW":
			description = "I wonder if Van Helsing ever used this one?";
			break;
		case "HALBERD":
			description = "Looks like a really long ax with a pokey bit at the top. How does somebody just leave this out here?";
			break;
		case "SPEAR":
			description = "It's a long stabbing stick";
			break;
		case "REVOLVER":
			description = "It's a gun that can only hold 6 bullets at a time but a skilled shooter can shoot all 6 in the blink of an eye and not miss a shot.";
			break;
		case "DOUBLE BARREL SHOTGUN":
			description = "A shotgun that can shoot 2 shells at a time but takes some time to before the next shot."
					+ " I feel like I should be yelling at some kids to get off my lawn.";
			break;
		case "NOVICE STAFF":
			description = "The first staff a learning mage ever gets. Pretty weak in the way of staves";
			break;
		case "INITIATE STAFF":
			description = "A staff given to a mage once they've proved their ability. Stronger than a novice staff.";
			break;
		case "GRAND MAGE STAFF":
			description = "A staff given to only the strongest and most talented mages. There is no staff stronger than a Grand Mage's staff.";
			break;
		case "NOVICE WAND":
			description = "It's a wizard's first magic stick. Do you really need a description?";
			break;
		case "INITIATE WAND":
			description = "This wand might've been owned by a hairy wizard, or maybe a wizard named Harry, nobody really know.";
			break;
		case "GRAND WIZARD WAND":
			description = "The strongest wand a wizard can get; only 1 in every 10,000 wizards bceome a Grand Wizard.";
			break;
		case "WHIP":
			description = "Some braided bits of leather that if moved quick enough make a loud cracking sound. Be careful of snakes though.";
			break;
		}
		System.out.println(description);
		
	}
	
	public static void eDescription(int j)
	{
		String desc= "";
		switch(effects[j].toUpperCase())
		{
		case "RUSTY":
			desc = "- damage, + bleed";
			break;
		case "TOXIC":
			desc = "+ poison";
			break;
		case "HOT":
			desc = "+ burn";
			break;
		case "CHARGED":
			desc = "+ lightning";
			break;
		case "FROZEN":
			desc = "+ freeze";
			break;
		case "STRIKER":
			desc = "+ damage";
			break;
		case "FEEBLE":
			desc = "- damage";
			break;
		}
		System.out.println(desc);
	}
	public static void chestWeapon()
	{
		Random rand = new Random();
		
	}
}
