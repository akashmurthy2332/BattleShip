import java.util.Scanner;

public class Battleship {
    
    private static int maxCol = 10;
    private static char maxRow = 'J';
    
    private static int HORIZONTAL = 0;
    private static int VERTICAL = 1;
    
    public static int[] shipLengths = {2, 3, 3, 4, 5};
    public static int numShips = 5;
    private static int maxHits = computeMaxHits();

    
    public static void main(String[] args) {
         System.out.println("=======================\nWelcome to Battle Ship\n=======================");
        
        Player human = new Player();
        Player computer = new Player();
        
        setUpShips("Human");
        setUpShips("Computer");
        
    }
    
     public void setUpShips(String p)
    {
        System.out.println("Time to place your ships.");
        if (p.equals("Human"))
            placeShipsFromInput();
        else
            placeShipsRandomly();
    }
    
    public void placeShipsFromInput()
    {
        System.out.println("Set up your ships on the grid please.")
         for(int i = 0; i < player.NUM_SHIPS; i++)
        {
            System.out.println("Hit the space bar to place the next ship.");
            System.out.println("Your current grid of ships.");
            player.printMyShips();
            
            int length = player.SHIP_LENGTHS[i];
            System.out.println("Now you need to place a ship of length " + length);
    }
    
    public void placeShipsRandomly()
    {
        System.out.println("Computer is setting up their ships on the grid.");
        for (int shipNum = 0; i < numShips; i++ )
        {
            
        }
    }
    
    
    public int computeMaxHits()
    {
        int total = 0;
        for (int len : shipLengths)
        {
            total += len;
        }
        return total;
    }
}
