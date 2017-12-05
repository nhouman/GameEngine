package PartTwo;
import java.util.*;

public class PlayerStats 
{
	int Temens;
	
	public static int Playerhealth(int Levels)
	{
		
		int health = 30;
		int healthmodifier;
		healthmodifier = (health*Levels) + (1*Levels);
		
		if (Levels>1)
		{
			health = health + healthmodifier;
			return health;
			
		}
		return health;
		
		
	}
	
	public static String Playername()
	{
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		return name;
		
		
	}
	
	public static void currency()
	{
		
		
	}
	
	
	

}
