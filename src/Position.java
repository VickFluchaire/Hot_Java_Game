/**
 * Class for the position
 * @author Fluchaire / Delaunay
 */
public class Position
{
	/**
	 *  initialization for x
	 */
	public static final int X_DEFAULT = 0;
	
	/**
	 * Initialization for y
	 */
	public static final int Y_DEFAULT = 0;
		
	/**
	 * Variable x for the number of the line
	 */
	private final int x;
	
	/**
	 * Variable y for the number of the line
	 */
	private final int y;
		
	/**
	 * 
	 */
	public Position()
	{
		this.x = Position.X_DEFAULT;
		this.y = Position.Y_DEFAULT;
	}

	/**
	 * @param x0
	 * @param y0
	 */
	public Position(int x0, int y0)
	{
		this.x = x0;
		this.y = y0;
	}

	/**
	 * method for get the coordinate of x
	 * @return x
	 */
	public int getX()
	{
		return this.x;
	}

	/**
	 * method for get the coordinate of y
	 * @return y
	 */
	public int getY()
	{
		return this.y;
	}
}