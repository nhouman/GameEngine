package PartTwo;

import java.*;
public class Main{
	public static void main(String[] args) {//Intro and loop things here
		
		PlayerStats.playerName();
		PlayerStats.displayStats();
		/*int weaponOdds = 0;	//1 is chest weapon, 0 is random weapon
		getWeapon(weaponOdds);
		*/
	}
	
	public static void getWeapon(int x) {
		if(x == 1)
			WeaponGenerator.chestWeapon(); //gets a random weapon with a guaranteed good effect
		else
			WeaponGenerator.randomWeapon();	//gets a random weapon with a chance of good or bad effects
	}
}
