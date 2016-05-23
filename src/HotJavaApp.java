import java.util.Scanner;

/**
 * Represent application of the game HotJava 
 * @author Fluchaire / Delaunay
 */

public class HotJavaApp
{

	/**
	 * Application's main
	 * @param args command-line arguments (unused)
	 */
	
	public static void main(String[] args)
	{
		/* Read and register a player name */
	
		
		
			Scanner sc = new Scanner(System.in);
	        System.out.println("Veuillez saisir un nom :");
	        String namescan = sc.nextLine();
	        Player player1;
	        player1 = new Player(namescan);
			System.out.println(" ");
			System.out.println("Bonjour " + player1.getName()+ " et bienvenue !");
			System.out.println(" ");
			System.out.println("Une partie de HotJavaGame a été créée");
			System.out.println(" ");
			System.out.println("**********************");
			System.out.println(" ");
	        Player player = new Player(player1, sc);
	        
	      
	        new HotJavaGame().play();
	        /*Board.generateBoard();*/
	        
	        sc.close();
	}

}