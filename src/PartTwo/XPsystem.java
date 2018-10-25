package PartTwo;
import java.util.*;
import java.io.*;

public class XPsystem {
	public static int playerXP(){
		int Level;
		int totalXPgain;
		int pxp = enemyXPgain();

		totalXPgain = pxp + 0;
		totalXPgain = playerLevel(totalXPgain)[0];
		Level = playerLevel(totalXPgain)[1];
		return Level;
	}

	private static int[] playerLevel(int TotalXPgain){
		int [] XPLevels = new int[2];
		String Level;
		int Levels = 1;

		switch (TotalXPgain){
		case 50:
			Level = "2";
			Levels = 2;
			System.out.println("Congrats you have leveled up, you've reached " + Level + " " + Levels);
			TotalXPgain = 0;
			XPLevels[0] = TotalXPgain;
			XPLevels[1] = Levels;
			return XPLevels;		
		case 120:
			Level = "3";
			Levels = 3;
			System.out.println("Congrats you have leveled up, you've reached " + Level + " " + Levels);
			TotalXPgain = 0;
			XPLevels[0] = TotalXPgain;
			XPLevels[1] = Levels;
			return XPLevels;
		case 190:
			Level = "4";
			Levels = 4;
			System.out.println("Congrats you have leveled up, you've reached " + Level + " " + Levels);
			TotalXPgain = 0;
			XPLevels[0] = TotalXPgain;
			XPLevels[1] = Levels;
			return XPLevels;
		case 250:
			Level = "5";
			Levels = 5;
			System.out.println("Congrats you have leveled up, you've reached " + Level + " " + Levels);
			TotalXPgain = 0;
			XPLevels[0] = TotalXPgain;
			XPLevels[1] = Levels;
			return XPLevels;
		case 400:
			Level = "6";
			Levels = 6;
			System.out.println("Congrats you have leveled up, you've reached " + Level + " " + Levels);
			TotalXPgain = 0;
			XPLevels[0] = TotalXPgain;
			XPLevels[1] = Levels;
			return XPLevels;
		case 620:
			Level = "7";
			Levels = 7;
			System.out.println("Congrats you have leveled up, you've reached " + Level + " " + Levels);
			TotalXPgain = 0;
			XPLevels[0] = TotalXPgain;
			XPLevels[1] = Levels;
			return XPLevels;
		}
		return XPLevels;
	}

	public static int enemyXPgain(){
		Random rand = new Random();
		EnemyTypes Enemy = new EnemyTypes();
		
		int choose = Enemy.enemyGenerator();
		int XP = 0;

		switch (choose){
			case 0:
				XP = rand.nextInt(40) +1;
				System.out.println("XP gained " + XP + "!");
				return XP;
			case 1:
				XP = rand.nextInt(10) +1;
				System.out.println("XP gained " + XP + "!");
				return XP;
			case 2:
				XP = rand.nextInt(25) +1;
				System.out.println("XP gained " + XP + "!");
				return XP;
			case 3:
				XP = rand.nextInt(30) +1;
				System.out.println("XP gained " + XP + "!");
				return XP;
			case 4:
				XP = rand.nextInt(50) +1;
				System.out.println("XP gained " + XP + "!");
				return XP;
		}
		return XP;
	}
}
