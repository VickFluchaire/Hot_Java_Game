/**
 * It's the board class
 * 
 * @author Delaunay / Fluchaire
 */
public class Board
{
	/**
	 * The main board [Number of lines][Number of column]
	 */
	private Tile[][] board;
	
	/**
	 * 
	 */
	private Position getX;
	
	/**
	 * 
	 */
	private Position getY;


	// le tableau doit contenir des références vers des objets
	// Les coordonnées doivent être récupérés dans Position et le test demande à Tile si la tuile est révélée ou non

	/**
	 * Constructor for the entire board which take two entire in parameters
	 */
	public Board()
	{
		this.setBoard(new Tile[7][7]);
	}

	/**
	 * Getter for the board
	 * @return the board
	 */
	public Tile[][] getBoard()
	{	
		return this.board;
	}

	/**
	 * Encapsulation for the creation of the board
	 * @param board the board to set
	 */
	public void setBoard(Tile[][] board)
	{
		this.board = board;
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
		if(position.getX() < 7 && position.getY() < 7)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	/**
	 * 
	 * @param position1 
	 * @param position2 
	 */
	public void swapTiles(Position position1, Position position2)
	{
		position1.x = position2.x;
		position1.y = position2.y;
				
	}
}
	

