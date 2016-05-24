import java.util.Scanner;

/**
 * Represent a HotJava game  
 * @author Fluchaire / Delaunay
 */

public class HotJavaGame
{

	/**
	 * Attributes
	 * 
	 * Create to count the total number of turn during a game
	 */
	private int nbTurn;

	/**
	 *  Create to show to the player when the coffee will flow
	 */
	private final int countdown;
	
	/**
	 * For using method of board
	 */
	private Board board;

	/**
	 * Use variables of an other object
	 */
	private Player player;
	
	/**
	 * Use variables of an other object
	 */
	private Position position;
	
	/**
	 * Use variables of an other object
	 */
	private Tile tile;
	
	/**
	 * 
	 */
	private Tile state;
	

	/**
	 * Create a new HotJava game, ready to be played
	 * The board is a table (an other object), of given size, initialized with reversed tiles
	 * The coffee comes from a random tile out of the square on the left side
	 * The coffee cup is placed randomly on the right side
	 * Player is ready to play
	 */
	public HotJavaGame()
	{
		this.nbTurn = 0;
		this.countdown = 10;
	}
	
	/**
	 * This method is for a game lost
	 * @return Defeat
	 */
	public boolean isGameOver()
	{
		return false;
	}
	

	/** 
	 * Play the game
	 *			while (<game is not over>)
	 *			{
	 *         		do
	 *         		{
	 *       			<ask player for a tile to handle>
	 *      		}
	 *        		while (<tile is not valid>)
	 *        
	 *         		if (<tile is hidden>)
	 *         		{
	 *         			<reveal tile>
	 
	 *         		}
	 *           	do
	 *           	{
	 *       	 		<ask player for the tile to swap with the first one>
	 *       		}
	 *           	while (<tile is valid>)
	 *           	<swap tiles>
	 *           	}
	 *           	<update coffee>
	 *           	<update game status>
	 *         }     			
	 */
	
	
	public void play()
	{

		this.board.generateBoard();
		this.board.afficher();
        
		/* After the creation of the interface and the board, our algorithm is not in link with our program */
		
		/*while(!this.isGameOver())
		{
			do
			{
				Position position = this.player.askForTilePosition();
			}
			
			while (this.Board.tileNotValid(this.position));
			{
				if (this.tile.state == false);
				{
					this.tile.reveal();
				}

				do
				{
					Position position = this.player.askForTilesToSwap();
				}
				while (this.tile.state == true);
				{
					Position board = this.board.swapTiles(this.position, this.position, this.position);
				}
				
			}

		}*/
	
	}
}
	
