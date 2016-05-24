import java.util.Scanner;

/**
 * This is a class where player's actions are defined 
 * @author Fluchaire, Delaunay
 */

public class Player
{
	
	
	/**
	 * Scanner permit a communication between the player and the application
	 */
	private Scanner scanner;	
	
	
	/**
	 * Creation of the object player
	 */
	private Object player;
	
	
	/**
	 * 
	 */
	String name; 
	
	
	/**
	 * @param name1
	 */
	public Player(String name1) 
	{
		this.name = name1; 
	}
	
	
	/**
	 * This method is dedicate to the player
	 * 
	 * @param player1
	 * @param sc
	 */
	public Player(Player player1, Scanner sc)
	{
		this.player = player1;
		this.scanner = sc;
	}
	
	
	/**
	 * Getter for the name
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}
	
	
	/**
	 * Ask player for a tile to handle
	 * @return Position
	 */
	public Position askForTilePosition()
	{
		return new Position();

	}
	
	
	/**
	 * Ask player for swap two tiles
	 * @return Position
	 */
	public Position askForTilesToSwap()
	{
		return new Position();
	}

}