/**
 * Class for a tile
 * @author Fluchaire / Delaunay
 */
public class Tile
{
	/**
	 * State of a tile
	 * Reveal (=true) or not Reveal (=false) that's the question
	 */
	public boolean state;
	
	
	/**
	 * Default Tile
	 */
	public Tile()
	{
		this.state = false;
	}
	
	
	/**
	 * Accessors for tiles reveal
	 */
	public void reveal()
	{
		this.state = true;
	}	
}