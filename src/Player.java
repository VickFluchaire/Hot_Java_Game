import java.util.Scanner;

/**
 * This is a class where player's actions are defined 
 * @author Fluchaire, Delaunay
 */

public class Player
{
	
	private Scanner scanner;
	
	private Board[][] board;
	
	private Object player;
	
	
	String name; 
	public Player(String name1) 
	{
		name = name1; 
	}
	
	/**
	 * This method is dedicate to the player
	 * 
	 * @param player
	 * @param sc
	 */

	public Player(Player player1, Scanner sc)
	{
		this.player = player1;
		this.board = new Board[7][7];
		this.scanner = sc;
	}
	
	/**
	 * Getter for the name
	 * @return
	 */
	public String getName()
	{
		return name;
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