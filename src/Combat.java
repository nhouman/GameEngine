import java.util.LinkedList;

import java.util.Random;
import PartTwo.*;


import java.util.Queue;
import java.util.*;

public class Combat<E> {
	//Combat is going to work in a queue system. Attacks are queued against each other, and the actions taken affect the other party

	PlayerStats Player = new PlayerStats();
	EnemyTypes EStats = new EnemyTypes();
	WeaponGenerator PlayerW = new WeaponGenerator();
	Queue<Integer> combatTurn = new PriorityQueue<Integer>();
	
		int [] EnemyAttackvalues = new int[2];
		
		int oppchoose = EStats.EnemyGenerator();
		String move;
		int health = Player.Playerhealth(1);
		int Ehealth = EStats.EnemyHealth(oppchoose);
		int money;
		int itemdmgMax = PlayerW.randomWeapon()[1];
		int itemdmgMin = PlayerW.randomWeapon()[0];
		String Playername = "Bell";
		String opp = EStats.GetEnemyName(oppchoose);
		
		
		
	
	//allocates turns during combat
	public void enqueue() 
	{
		boolean run = true;
		int playerturn = 1;
		int AIturn = 2;
		
		System.out.println("Current Health: " + health + "\n");
		
		while(run)
		{
		
		
		combatTurn.add(playerturn);
		dequeue(playerturn, AIturn);
		combatTurn.remove();
		run = CheckBattlestatus();
		if (run==false)
		{
			break;
		}
		combatTurn.add(AIturn);
		dequeue(playerturn, AIturn);
		combatTurn.remove();
		run = CheckBattlestatus();
		
	
		}
		
		System.out.println("\nBattle End");
	}

	public void dequeue(int playerturn, int AIturn) 
	{
		
		
		if(combatTurn.element()==playerturn)
		{
			move = Playeraction();
			
			
		}
		if(combatTurn.element()==AIturn)
		{
			if (move.charAt(0) == 'B' || move.charAt(0) == 'b')
			{
				return;
			}
			
			int Edmg = AIgetAttack();
			Playerhealth(Edmg);
			
		}
		
		

	}
	
	//Player chooses action
	public String PlayerChoosemove()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to do?\n");
		System.out.println(">Attack<");
		System.out.println(">Block<");
		System.out.println(">Items<");
		String move = in.nextLine();
		return move;
		
	}
	
	public boolean CheckBattlestatus() //checks player and AI death in a single class 
	{
		boolean run;
		boolean run1;
		run = AIisDead();
		run1 = PlayerisDead();
		
		if (run==false)
		{
			return false;
		}
		if (run1==false)
		{
			return false;
		}

		return true;
		
	}
	
	//checks player choice for combat option
	public String Playeraction()
	{
		String move = PlayerChoosemove();
		switch (move.charAt(0))
		{
			case 'A':
			case 'a':
			{
				int Pdmg = PlayergetAttack();
				AIhealth(Pdmg);
				break;
			
			}
			case 'B':
			case 'b':
			{
				int Edmg = AIgetAttack();
				PlayergetBlock(Edmg);
				return move;
			}
			case 'I':
			case 'i':
			{
				break;
			}
		
		}
		return move;
	}
	
	//Initializes AI attack and returns the damage output  
	public int AIgetAttack()
	{
		Random rand = new Random();
		EnemyAttackvalues[0] = EStats.EnemyAttackDMG(oppchoose)[0]; //gets enemy min attack
		EnemyAttackvalues[1] = EStats.EnemyAttackDMG(oppchoose)[1]; //gets enemy max attack
		int AIattack = rand.nextInt(EnemyAttackvalues[1]) + EnemyAttackvalues[0];
		System.out.println(opp + " Attacks you: " + AIattack);
		return AIattack;
	}
	
	//checks AI health after a player attack
	public void AIhealth(int Pdmg)
	{
		
		Ehealth = Ehealth - Pdmg; //subtracts enemy health from player dmg
		System.out.println("\n" + opp + " HP: " + Ehealth);
		
	}
	
	//checks if the opponent is defeated so player may continue
	public boolean AIisDead()
	{
		XPsystem XPgain = new XPsystem();
		EnemyLootDrop loot = new EnemyLootDrop();
	
		boolean Notdead;
		if (Ehealth>0)
		{
			Notdead = true;
			return Notdead;
		}
		else 
		{
			System.out.println("You've defeated " + opp);
			loot.EnemydropsItems();
			loot.EnemydropsCurrency();
			XPgain.PlayerXP();
			Notdead = false;
			return Notdead;
		}
	}
		
		//checks for game over on players  side
		public boolean PlayerisDead()
		{
			boolean Notdead;
			if (health>0)
			{
				Notdead = true;
				return Notdead;
			}
			else 
			{
				System.out.println("You've been Killed...Game Over!");
				Notdead = false;
				return Notdead;
			}
			
	}
		//gets the players health after an enemy attack
		public void Playerhealth(int Edmg)
		{
			
			health = health - Edmg; //subtracts health from enemy dmg
			System.out.println("\n" + Playername + " HP: " + health);
			
		}
		
		//Initialize player attacks and returns the damage output based on the attack item damage range
		public int PlayergetAttack()
		{
			Random rand = new Random();
			int Playerattack = rand.nextInt(itemdmgMax) + itemdmgMin;
			System.out.println(Playername + " Attacks: " + Playerattack);
			return Playerattack;
		}
		
		//For the blocking option, randomly generates block amount and subtracts it from enemy attack
		public void PlayergetBlock(int Edmg)
		{
			Random rand = new Random();
			int block = rand.nextInt(10) + 1;
			
			if (block>Edmg)   //checks if block is greater than enemy dmg to avoid adding health
			{
				health = health;
				System.out.println(Playername + "blocked for: " + block);
				System.out.println(Playername + " HP: " + health);
				return;
			}
			health = health - (Edmg - block);
			System.out.println(Playername + "blocked for: " + block);
			System.out.println(Playername + " HP: " + health);
			
		}
}
