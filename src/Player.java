import java.util.ArrayList;

public class Player extends Entity{

	private ArrayList<Item> inventory = new ArrayList<Item>();
	private int inventorySize = 2;
	private int playerNum = 95;
	private int yPos = 0;
	private int xPos = 0;
	
	public Player(String name, int health) 
	{
		super(name, health);
	}

	public void addItem(Item i)
	{
		if (inventory.size() >= inventorySize)
		{
			System.out.println("Inventory too full, discarding item.");
		} else
			inventory.add(i);
	}
	
	public void setPlayerNum(int playerNum)
	{
		this.playerNum = playerNum;
	}
	
	public void setYPos(int yPos)
	{
		this.yPos += yPos;
	}
	
	public void setXPos(int xPos)
	{
		this.xPos += xPos;
	}
	
	public int getXPos()
	{
		return xPos;
	}
	
	public int getYPos()
	{
		return yPos;
	}
	
	public int getPlayerNum()
	{
		return playerNum;
	}
}
