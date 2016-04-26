/**
 * Class for a tile
 * @author Fluchaire / Delaunay
 */
public class Tile
{
	/**
	 * State of a tile
	 * Reveal or not Reveal that's the question
	 */
	public Boolean state;
	
	// (TODO) Need correction for each method and constructor because we change the type of state (String to Boolean)
	
	/**
	 * Default Tile
	 */
	public Tile()
	{
		this.state = "Unreveal";
	}
	
	
	/**
	 * Accessors for tiles unreveal
	 * @return stateUnreveal
	 */
	public String tileUnreveal()
	{
		return this.state = "Unreveal";
	}
	
	/**
	 * Accessors for tiles reveal
	 * @return stateReveal
	 */
	public String tileReveal()
	{
		return this.state = "Reveal";
	}
	
	/**
	 * A tile not valid it's a tile with coffee or if the player give bad instructions
	 * @return False
	 */
	public boolean tileNotValid()
	{
		return false;	
	}
	
}
