/**
 * It's an idea to create a board in an other class board
 * We let in comment the precedent configuration
 * @author Delaunay / Fluchaire
 */
public class Board
{
	/**
	 * Represent the line's number in the board
	 */
	private final int nbLine;
	
	/**
	 * Represent the column's number in the board
	 */
	private final int nbCol;
	
	/**
	 * The main board [Number of lines][Number of column]
	 */
	private char[][] board;
	
	/**
	 * Take the valor from position for x
	 */
	private Position x;
	
	/**
	 * Take the valor from position for y
	 */
	private Position y;

	// le tableau doit contenir des références vers des objets
	// Les coordonnées doivent être récupérés dans Position et le test demande à Tile si la tuile est révélée ou non

	/**
	 * Constructor for the entire board which take two entire in parameters
	 * @param n
	 * @param p
	 */
	public Board(int n, int p)
	{
		this.nbLine = n;
		this.nbCol = p;
		this.setBoard(new char[this.nbLine][this.nbCol]);
	}

	/**
	 * Getter for the board
	 * @return the board
	 */
	public char[][] getBoard()
	{	
		return this.board;
	}

	/**
	 * Encapsulation for the creation of the board
	 * @param board the board to set
	 */
	public void setBoard(char[][] board)
	{
		this.board = board;
	}
	
	//(TODO) A finir
	/**
	 * This method permit to ask passing by Position and Tile if the tile selected is valid or not 
	 * 
	 * @param x 
	 * @param y 
	 * @return  boolean
	 */
	public boolean tileNotValid(int x, int y)
	{
		for(int x1 = 0; x1 < this.nbLine; x1++)
		{
			for(int y1 = 0; y1 < this.nbCol; y1++)
			{
				
			}
		}
		return false;
	}
	
	
	
	/**
	 * Display for the main board
	 * return display
	 */
	public String toString()
	{
		for(int i = 0; i < this.nbLine; i++)
		{
			for(int j=0; j < this.nbCol; j++)
			{
				
			}
		}
		return null;
	}
	
}

