package PartTwo;
import java.util.*;
public class WeaponGenerator 
{	
	private static ArrayList <String> weapons = new ArrayList<String> (16);
	//fill weapons list
	static
	{
		weapons.add("Dagger");
		weapons.add("Sword");
		weapons.add("Katana");
		weapons.add("Recurve Bow");
		weapons.add("Crossbow");
		weapons.add("Halberd");
		weapons.add("Spear");
		weapons.add("Revolver");
		weapons.add("Double Barrel Shotgun");
		weapons.add("Novice Staff");
		weapons.add("Initiate Staff");
		weapons.add("Grand Mage Staff;");
		weapons.add("Novice Wand");
		weapons.add("Initiate Wand");
		weapons.add("Grand Wizard Wand");
		weapons.add("Whip");
	}
	
	private static ArrayList <String> effects =  new ArrayList <String>(); 
	//fill effects list
	static
	{
		effects.add("Rusty");
		effects.add("Feeble");
		effects.add("Toxic");
		effects.add("Hot");
		effects.add("Charged");
		effects.add("Frozen");
		effects.add("Striker");	
	}
	
	public static int[] randomWeapon()
	{
		Random rand = new Random();	
		int [] holdweaponDMG = new int [2];
		int DMGMin;	 // holds wapon dmg min
		int DMGMax;  //holds weapon dmg max
		int i = rand.nextInt(weapons.size());
		int k = rand.nextInt(5);		//gets random num  0 - 4
		if(k == 4)			//if num = 4, add effect
		{
			int j = rand.nextInt(effects.size());		//gets random effect
			System.out.println(effects.get(j) + " " + weapons.get(i));
			wDescription(i);
			eDescription(j);
			DMGMin = wDMG(i)[0];
			DMGMax = wDMG(i)[1];
			holdweaponDMG[0] = DMGMin;
			holdweaponDMG[1] = DMGMax;
			return holdweaponDMG;
		}
		else 		//else no effect
		{
			System.out.println(weapons.get(i));	
			wDescription(i);
			DMGMin = wDMG(i)[0];
			DMGMax = wDMG(i)[1];
			holdweaponDMG[0] = DMGMin;
			holdweaponDMG[1] = DMGMax;
			return holdweaponDMG;
		}
	}
	
	
	public static void wDescription(int i)		//weapon descriptions
	{
		String description = "";
		
		switch(weapons.get(i).toUpperCase())
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
	
	public static void eDescription(int j) 		//effect descriptions
	{
		String desc= "";
		switch(effects.get(j).toUpperCase())
		{
		case "RUSTY":
			desc = "- damage, + bleed";
			break;
		case "TOXIC":
			desc = "+ poison damage";
			break;
		case "HOT":
			desc = "+ burn damage";
			break;
		case "CHARGED":
			desc = "+ lightning damage";
			break;
		case "FROZEN":
			desc = "+ freeze damage ";
			break;
		case "STRIKER":
			desc = "+ damage";
			break;
		case "FEEBLE":
			desc = "- damage";
			break;
		}
		System.out.println(effects.get(j) + ": " + desc);
	}
	public static void chestWeapon()		//creates a better weapon to be pulled from a chest
	{
		Random rand = new Random();
		
		effects.remove("Rusty");
		effects.remove("Feeble");
		
		int weapon = rand.nextInt(weapons.size());		//gets weapon
		int effect = rand.nextInt(effects.size());		//gets effect

		System.out.println(effects.get(effect) + " " + weapons.get(weapon));
		wDescription(weapon);
		eDescription(effect);
	}
	
	public static int [] wDMG(int i)		//weapon dmg values
	{
		int [] DMGvalues = new int [2];
		int MaxDMG;
		int MinDMG;
		
		
		switch(weapons.get(i).toUpperCase())
		{
		case "DAGGER":
		{
			MinDMG = 1;
			MaxDMG = 6;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "SWORD":
		{
			MinDMG = 3;
			MaxDMG = 6;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "KATANA":
		{
			MinDMG = 4;
			MaxDMG = 9;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "RECURVE BOW":
		{
			MinDMG = 2;
			MaxDMG = 5;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "CROSSBOW":
		{
			MinDMG = 5;
			MaxDMG = 7;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "HALBERD":
		{
			MinDMG = 10;
			MaxDMG = 14;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "SPEAR":
		{
			MinDMG = 1;
			MaxDMG = 10;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "REVOLVER":
		{
			MinDMG = 5;
			MaxDMG = 14;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "DOUBLE BARREL SHOTGUN":
		{
			MinDMG = 7;
			MaxDMG = 12;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "NOVICE STAFF":
		{
			MinDMG = 1;
			MaxDMG = 4;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "INITIATE STAFF":
		{
			MinDMG = 8;
			MaxDMG = 16;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "GRAND MAGE STAFF":
		{
			MinDMG = 17;
			MaxDMG = 25;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "NOVICE WAND":
		{
			MinDMG = 2;
			MaxDMG = 4;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "INITIATE WAND":
		{
			MinDMG = 5;
			MaxDMG = 8;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "GRAND WIZARD WAND":
		{
			MinDMG = 1;
			MaxDMG = 25;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		case "WHIP":
		{
			MinDMG = 3;
			MaxDMG = 12;
			DMGvalues[0] = MinDMG;
			DMGvalues[1] = MaxDMG;
			return DMGvalues;
		}
		}
		return DMGvalues;
		
	}
	
	
}
