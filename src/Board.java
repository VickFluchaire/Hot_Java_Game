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
	 * Creation for the variable board
	 */
	private Tile[][] board;
	

	/**
	 * Constructor for the entire board which take two entire in parameters
	 */
	public Board()
	{
		this.board = new Tile[BOARD_SIZE][BOARD_SIZE];
		
		System.out.println(this.board[BOARD_SIZE][BOARD_SIZE]); 
	
	}
	
	/**
	 * This method is the hardest version to create a board
	 * @return board
	 * 
	 */
	public Tile[][] generateBoard()
	{
		
		/* First Line */
		this.board[1][1]= new Tile();
	    this.board[1][2]= new Tile();
	    this.board[1][3]= new Tile();
	    this.board[1][4]= new Tile();
	    this.board[1][5]= new Tile();
	    this.board[1][6]= new Tile();
	    this.board[1][7]= new Tile();
	    
	    /* Second Line */
	    this.board[2][1]= new Tile();
	    this.board[2][2]= new Tile();
	    this.board[2][3]= new Tile();
	    this.board[2][4]= new Tile();
	    this.board[2][5]= new Tile();
	    this.board[2][6]= new Tile();
	    this.board[2][7]= new Tile();
	    
	    /* Third Line */
	    this.board[3][1]= new Tile();
	    this.board[3][2]= new Tile();
	    this.board[3][3]= new Tile();
	    this.board[3][4]= new Tile();
	    this.board[3][5]= new Tile();
	    this.board[3][6]= new Tile();
	    this.board[3][7]= new Tile();
	    
	    /* Fourth Line */
	    this.board[4][1]= new Tile();
	    this.board[4][2]= new Tile();
	    this.board[4][3]= new Tile();
	    this.board[4][4]= new Tile();
	    this.board[4][5]= new Tile();
	    this.board[4][6]= new Tile();
	    this.board[4][7]= new Tile();
	    
	    /* Fifth Line */
	    this.board[5][1]= new Tile();
	    this.board[5][2]= new Tile();
	    this.board[5][3]= new Tile();
	    this.board[5][4]= new Tile();
	    this.board[5][5]= new Tile();
	    this.board[5][6]= new Tile();
	    this.board[5][7]= new Tile();
	    
	    /* Sixth Line */
	    this.board[6][1]= new Tile();
	    this.board[6][2]= new Tile();
	    this.board[6][3]= new Tile();
	    this.board[6][4]= new Tile();
	    this.board[6][5]= new Tile();
	    this.board[6][6]= new Tile();
	    this.board[6][7]= new Tile();
	    
	    /* Seventh Line */
	    this.board[7][1]= new Tile();
	    this.board[7][2]= new Tile();
	    this.board[7][3]= new Tile();
	    this.board[7][4]= new Tile();
	    this.board[7][5]= new Tile();
	    this.board[7][6]= new Tile();
	    this.board[7][7]= new Tile();
	    
	    return this.board;
	}
    
    
	
	/**
	 * This is the display for the board
	 */
    public void afficher()
    {
        System.out.println();
        for(int i=0; i<BOARD_SIZE; i++)
        {
            for(int j=0; j<BOARD_SIZE; j++)
            {
                System.out.print(" | " + this.board[i][j]);
            }
            System.out.println(" | ");
        }
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
	 * Creation for the position p1
	 */
	private Position p1;

	
	/**
	 * Creation for the position p2
	 */
	private Position p2;

	
	/**
	 * Creation for the position p3
	 */
	private Position p3;

	
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