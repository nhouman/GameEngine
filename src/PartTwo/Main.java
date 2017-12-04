package PartTwo;

import java.*;
public class Main {

	public static void main(String[] args) {//Intro and loop things here
		WeaponGenerator.randomWeapon();		//gets a random weapon with a chance of good or bad effects
		System.out.println();
		WeaponGenerator.chestWeapon();		//gets a random weapon with a guaranteed good effect
		
	}
}
