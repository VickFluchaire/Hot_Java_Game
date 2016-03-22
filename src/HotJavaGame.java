
/**
 * Represent a HotJava game
 * @author Fluchaire, Delaunay
 */

public class HotJavaGame
{
	// TODO fix comment (ask for advice)
	/**
	 * Attributes
	 * 
	 * -nbTurn create to count the total number of turn during a game
	 */
	private int nbTurn;
	
	// TODO fix comment (ask for advice)	
	/**
	 * -countdown is create to show to the player when the coffee will flow
	 */
	private int countdown;
	
	// TODO fix comment (ask for advice)
	/**
	 * -nbline represent the line's number in the board
	 */
	private int nbLine;
	
	// TODO fix comment (ask for advice)
	/**
	 * -nbCol represent the column's number in the board
	 */
	private int nbCol;
	
	// TODO fix comment (ask for advice)
	/**
	 * -board is the main board 
	 */
	private char[][] board;


	/**
	 * Create a new HotJava game, ready to be played
	 * The board is a table (an other object) initialized with reversed tiles
	 * The coffee comes from a random tile out of the square on the left side
	 * The coffee cup is placed randomly on the right side
	 * countdown is initialized at 10
	 * nbTurn is initialized at 0
	 */
	
	public HotJavaGame(int n, int p)
	{
		this.nbTurn = 0;
		this.countdown = 10;
		this.nbLine = n;
		this.nbCol = p;
		this.board = new char [nbLine][nbCol];
	}
	
	// TODO clarify algorithm (ask for advice)
	/** 
	 * Start the game
	 * 
	 * countdown and nbTurn are initialized
	 * 
	 * According to countdown 
	 * 		while countdown > 0
	 * 			The player can do 1 action;
	 * 				// 1 action = returning 1 tile OR Swap two tiles
	 * 			countdown --;
	 * 			nbTurn ++;
	 * 		When countdown = 0 the coffee begin fill tile
	 * 			if the coffee can't advance
	 * 				the player lose the game;
	 * 				display ("You lose", nbTurn);
	 * 				The player have the choice to restart the game
	 * 			else
	 * 				the player can continue the game;
	 * 				reinitialized countdown at 10;
	 * 
	 * Except case :
	 * When the coffee reach the cup
	 * 		display ("You win",nbTurn)
	 * 
	 */
	
	public void play()
	{
		
	}

}
