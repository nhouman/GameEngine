package PartTwo;
import java.util.*;
public class ItemGenerator 
{
	static String item;
	static String description;
	static int index;
	public static void main(String[] args){
		randomItem();
	}
	
	private static ArrayList<String> items = new ArrayList<String>(9);
	static { //fill Items 
	
		items.add("Energy Drink S");
		items.add("Energy Drink M");
		items.add("Energy Drink Extreme");
		items.add("Blaze");
		items.add("Chest Key");
		items.add("Skull");
		items.add("Nanter Horn");
		items.add("Caedus Helmet");
		items.add("Cardboard");
	}
	
	//Generate random item for enemy drops
	public static void randomItem(){
		Random rand = new Random();					
		index = rand.nextInt(items.size());				//gets random number for item
		System.out.println(items.get(index));			//prints item
		iDescription(index);							//prints item description
		
	}
	
	public static void iDescription(int i) {		//Item descriptions	
		switch(items.get(i).toUpperCase()){
		case "ENERGY DRINK S":
			description = "A small drink that resotres a little health";
			break;
		case "ENERGY DRINK M":
			description = "A medium drink that resotres some health";
			break;
		case "ENERGY DRINK L":
			description = "A large drink that resotres most health";
			break;
		case "BLAZE":
			description = "Smoke some of this to restore your mana... don’t worry its legal... maybe";
			break;
		case "CHEST KEY":
			description = "A random key that can open any ordinary chest";
			break;
		case "SKULL":
			description = "A skull from one of your enemies... pretty useless and has no value";
			break;
		case "NANTER HORN":
			description = "A horn from one of the giant killer beatles found on the planet Gnash, has some value";
			break;
		case "CAEDUS HELMET":
			description = "A helmet from one of the Regimes soldiers, too bad it's burned so it's unwearable";
			break;
		case "CARDBOARD":
			description = "A piece of carboard, you can use it as armor... not very good at stopping bullets though";
			break;
		}
		System.out.println("\"" + description + "\"");
	}
	
	public static String getItem() {
		
		
		return item;
	}
}
