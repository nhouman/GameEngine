package PartTwo;
import java.util.*;
public class ItemGenerator 
{
	
	public static void main(String[] args)
	{
		randomItem();
	}
	
	private static ArrayList<String> Items = new ArrayList<String>(9);
	
	
	
	static //fill Items 
	{
		Items.add("Energy Drink S");
		Items.add("Energy Drink M");
		Items.add("Energy Drink Extreme");
		Items.add("Blaze");
		Items.add("Chest Key");
		Items.add("Skull");
		Items.add("Nanter Horn");
		Items.add("Caedus Helmet");
		Items.add("Cardboard");
		
		
	}
	
	//Generate random item for enemy drops
	public static void randomItem()
	{
		Random rand = new Random();	
		int i = rand.nextInt(Items.size());
		
		
			System.out.println(Items.get(i));	
			IDescription(i);
		
	}
	
	
	public static void IDescription(int i)		//Item descriptions
	{
		String description = "";
		
		switch(Items.get(i).toUpperCase())
		{
		case "ENERGY DRINK S":
			description = "A small drink that resotres a little health";
			break;
		case "ENERGY DRINK M":
			description = "A medium drink that resotres some health";
			break;
		case "ENERGY DRINK EXTREME":
			description = "A large drink that resotres most health";
			break;
		case "BLAZE":
			description = "Smoke some of this to restore your mana…don’t worry its legal…maybe";
			break;
		case "CHEST KEY":
			description = "A random key that can open any ordinary chest";
			break;
		case "SKULL":
			description = "A skull from one of your enemies...pretty useless and has no value";
			break;
		case "NANTER HORN":
			description = "A horn from one of the giant killer beatles found on the planet Gnash, has some value";
			break;
		case "CAEDUS HELMET":
			description = "A helmet from one of the Regimes soldiers, too bad it's burned so it's unwearable";
			break;
		case "CARDBOARD":
			description = "A piece of carboard, you can use it as armor...don't think it's good at stopping bullets though";
			break;

		}
		
		System.out.println("\"" + description + "\"");
		
	}
}
