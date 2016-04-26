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
	private char[][]board;
	
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
	
}
