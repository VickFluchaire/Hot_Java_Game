
/**
 * Represent a HotJava game
 * @author Fluchaire, Delaunay
 */

public class HotJavaGame
{
	// TODO (DONE) fix comment (ask for advice)
	/**
	 * Attributes
	 * 
	 * Create to count the total number of turn during a game
	 */
	private int nbTurn;
	
	// TODO (DONE) fix comment (ask for advice)	
	/**
	 *  Create to show to the player when the coffee will flow
	 */
	private final int countdown;
	
	// TODO (DONE) fix comment (ask for advice)
	/**
	 * Represent the line's number in the board
	 */
	private final int nbLine;
	
	// TODO (DONE) fix comment (ask for advice)
	/**
	 * Represent the column's number in the board
	 */
	private final int nbCol;
	
	// TODO (DONE) fix comment (ask for advice)
	/**
	 * The main board 
	 */
	private char[][] board;

	/**
	 * 
	 */
	private Player player;


	/**
	 * Create a new HotJava game, ready to be played
	 * The board is a table (an other object), of given size, initialized with reversed tiles
	 * The coffee comes from a random tile out of the square on the left side
	 * The coffee cup is placed randomly on the right side
	 * Player is ready to play
	 * 
	 * @param n number of lines
	 * @param p number of columns
	 * 
	 */
	public HotJavaGame(int n, int p)
	{
		this.nbTurn = 0;
		this.countdown = 10;
		this.nbLine = n;
		this.nbCol = p;
		this.board = new char [this.nbLine][this.nbCol];
		this.player = new Player();
	}
	
	
	/**
	 * This method is for a game lost
	 * @return Defeat
	 */
	public boolean isGameOver()
	{
		// TODO tbc
		return false;
	}
	
	
	
	// TODO clarify algorithm (ask for advice)
	/** 
	 * Play the game
	 * 
	 * 		while (<game is not over>)
	 *         do
	 *       	 <ask player for a tile to handle>
	 *         while (<tile is not valid>)
	 *         if (<tile is hidden)
	 *         	<reveal tile>
	 *         else
	 *           do
	 *       	 	<ask player for the tile to swap with the first one>
	 *           while (<tile is not valid>)
	 *           <swap tiles>
	 *           <update coffee>
	 *           <update score>
	 */
	
	public void play()
	{
		while(!this.isGameOver())
		{
			do
			{
				Position position = this.player.askForTile(); 
			}
		}
			
		
	}
	

}
