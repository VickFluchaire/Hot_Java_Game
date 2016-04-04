/**
 * This is a class where player's actions are defined
 */

public class Player
{
	/**
	 * Attributes
	 * 
	 * Initialization of X_PAR_DEFAUT and Y_PAR_DEFAUT
	 */
	public final static int X_PAR_DEFAUT = 0;
	public final static int Y_PAR_DEFAUT = 0;
	
	/**
	 * Initialization coordinates : x nb lignes, y nb column
	 */
	private static int x;
	private static int y;
	
	/**
	 * @return Initialization / coordinates on default
	 */
	public void Position()	
	{
		this.x = Player.X_PAR_DEFAUT;
		this.y = Player.Y_PAR_DEFAUT;
	}
	
	/**
	 * /!\ Error we are blocked /!\
	 * @param x0
	 * @param y0
	 */
	public Position(int x0, int y0)
	{
		super(n, p);
		this.x = Player.x0;
		this.y = Player.y0;
	}

	// TODO (DONE) write comment
	/**
	 * Ask player for a tile to handle
	 * @return Position
	 */
	public Position askForTile()
	{
		return new Position();

	}
	
}
