/**
 * It's the board class
 * 
 * @author Delaunay / Fluchaire
 */
public class Board
{
	/**
	 * Initialization at 7 column and 7 row for our board
	 */
	public final static int BOARD_SIZE = 7;
	

	/**
	 * 
	 */
	private Tile[][] board;

	/**
	 * 
	 */
	private Position p1;

	/**
	 * 
	 */
	private Position p2;

	/**
	 * 
	 */
	private Position p3;

	/**
	 * Constructor for the entire board which take two entire in parameters
	 */
	public Board()
	{
		this.board = new Tile[BOARD_SIZE][BOARD_SIZE];
		
		System.out.println(this.board[BOARD_SIZE][BOARD_SIZE]); 
	}
	
	/**
	 * This method permit to ask passing by Position and Tile if the tile selected is valid or not 
	 * 
	 * A tile is not valid if, there are already coffee on it, if the player select a position out of the board
	 * @param position 
	 * @return  boolean
	 */
	public boolean tileNotValid(Position position)
	{
		if(position.getX() < BOARD_SIZE && position.getY() < BOARD_SIZE)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	/**
	 * @param p1 
	 * @param p2 
	 * @param p3 
	 * 
	 * method to swap tiles
	 * @return null
	 */
	public Position swapTiles(Position p1, Position p2, Position p3)
	{
		this.p3 = this.p1;
		this.p1 = this.p2;
		this.p2 = this.p3;
		return null;
	}
	
	
	/**
	 * @return message
	 */
	public String tilesSwap()
	{
		return "Tiles"+this.p1+","+this.p2+"swaped";
	}
}