package PartTwo;
import java.util.Random;

public class EnemyLootDrop {
	//currency of the game
	int gold;
	
	//Enemies drop random amount of currency
	public int EnemydropsCurrency(){
		Random rand = new Random();
		gold = rand.nextInt(100) + 1;
		System.out.println("Temens gained: " + gold);
		return gold;
	}
	
	//Enemies drop a random item
	public void EnemydropsItems(){
		ItemGenerator EDrop = new ItemGenerator();
		
		System.out.print("You've obtained: ");
		EDrop.randomItem();
		
	}
	
	
	

}
