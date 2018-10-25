package PartTwo;
import java.util.*;

public class EnemyTypes {
	
	static ArrayList<String> Enemies = new ArrayList<String>(5);
	
	static{
		Enemies.add("Caedus");
		Enemies.add("Nanters");
		Enemies.add("Yagas");
		Enemies.add("Redcaps");
		Enemies.add("Dullahan");
	}
	
	//Generates random enemies
	public static int enemyGenerator(){
		Random rand = new Random();
		
		int choose = rand.nextInt(5);
		
		switch (choose){
			case 0:
				Enemies.get(0);
				return choose;
			case 1:
				Enemies.get(1);
				return choose;
			case 2:
				Enemies.get(2);
				return choose;
			case 3:
				Enemies.get(3);
				return choose;
			case 4:
				Enemies.get(4);
				return choose;
		}
		return choose;
		
	}
	
	//Get the attack dmg range for each enemy type
	public int[] enemyAttackDMG(int choose){
			
			int [] EattackValues = new int[2];
			int EattackMax;
			int EattackMin;
			
			switch (choose){
				case 0:
					EattackMin = 4;
					EattackMax = 12;
					EattackValues[0] = EattackMin;
					EattackValues[1] = EattackMax;
					return EattackValues;
				case 1:
					EattackMin = 1;
					EattackMax = 6;
					EattackValues[0] = EattackMin;
					EattackValues[1] = EattackMax;
					return EattackValues;
				case 2:
					EattackMin = 8;
					EattackMax = 17;
					EattackValues[0] = EattackMin;
					EattackValues[1] = EattackMax;
					return EattackValues;
				case 3:
					EattackMin = 5;
					EattackMax = 10;
					EattackValues[0] = EattackMin;
					EattackValues[1] = EattackMax;
					return EattackValues;
				case 4:
					EattackMin = 11;
					EattackMax = 20;
					EattackValues[0] = EattackMin;
					EattackValues[1] = EattackMax;
					return EattackValues;
			}
			return EattackValues;
			
		}
	
	public static String getEnemyName(int choose){
		String hold = null; //used as the default case
		
		switch (choose){
			case 0:
				System.out.println("You've encountered a " + Enemies.get(0));
				return Enemies.get(0);
			case 1:
				System.out.println("You've encountered a " + Enemies.get(1));
				return Enemies.get(1);
			case 2:
				System.out.println("You've encountered a " + Enemies.get(2));
				return Enemies.get(2);
			case 3:
				System.out.println("You've encountered a " + Enemies.get(3));
				return Enemies.get(3);
			case 4:
				System.out.println("You've encountered a " + Enemies.get(4));
				return Enemies.get(4);
		}
		return hold;
	}
	public static int enemyHealth(int choose){
		int health = 0;
		
		switch (choose){
			case 0:
				health = 30;
				return health;
			case 1:
				health = 15;
				return health;
			case 2:
				health = 35;
				return health;
			case 3:
				health = 45;
				return health;
			case 4:
				health = 55;
				return health;
		}
		return health;
		
	}
	
}
	
	


