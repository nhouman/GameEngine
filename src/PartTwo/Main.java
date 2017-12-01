package PartTwo;

public class Main {

	public static void main(String[] args) {//Intro and loop things here
		WeaponGenerator wd = new WeaponGenerator();
		for(int i = 0; i < 25; i++)
		{
			wd.randomWeapon();
		}
	}
}
