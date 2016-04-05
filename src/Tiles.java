/**
 * 
 */

/**
 * @author Fluchaire / Delaunay
 *
 */
public class Tiles
{
	/**
	 * State of a tile
	 */
	public String state;
	
	/**
	 * 
	 */
	
	
	/**
	 * Initialization for tiles
	 */
	public Tiles()
	{
		this.state = "Unreveal";
	}
	
	
	/**
	 * Accessors for tiles unreveal
	 * @return stateUnreveal
	 */
	public String tilesUnreveal()
	{
		return this.state = "Unreveal";
	}
	
	/**
	 * Accessors for tiles reveal
	 * @return stateReveal
	 */
	public String tilesReveal()
	{
		return this.state = "Reveal";
	}
	
	/**
	 * A tiles not valid it's a tile with coffee or if the player give bad instructions
	 * @return False
	 */
	public boolean tileNotValid()
	{
		
		return false;	
	}
	/**
	 * 
	 * @return False
	 */
	public boolean tileReveal()
	{
		return false;
	}
	
}
