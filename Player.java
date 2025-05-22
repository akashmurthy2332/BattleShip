public class Player
{
    // Static constants for the Player class
    public static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    public static final int NUM_SHIPS = 5;
    private static final int MAX_HITS = computeMaxHits();

    // Direction constants
    private static final int UNSET = -1;
    private static final int HORIZONTAL = 0;
    private static final int VERTICAL = 1;

    private Grid myGrid;
    private Grid opponentGrid;
    private Ship[] myShips;
    private int numShips;
    private int totalHitsTaken;
    private int totalHitsDelivered;

    public Player()
    {
        myGrid = new Grid();
        opponentGrid = new Grid();
        myShips = new Ship[NUM_SHIPS];
        numShips = 0;
        totalHitsTaken = 0;
        totalHitsDelivered = 0;
    }

    
    private static int computeMaxHits()
    {
       
    }

    public void initializeShipsRandomly()
    {
        
    }

    // Adds a ship if it's a legal placement
    // Returns whether the ship was successfully added
    public boolean addShip(Ship s)
    {
        
    }

    public int getRandomRowGuess()
    {
        int max = 10;
        int min = 0;
        return (int)(Math.random()*(max-min+1)+min);
    }

    public int getRandomColGuess()
    {
        int max = 10;
        int min = 0;
        return (int)(Math.random()*(max-min+1)+min);
    }

    public boolean makeGuess(int row, int col, Player other)
    {
        if(opponentGrid.alreadyGuessed(row, col))
        {
            return false;
        }

        boolean hit = other.recordOpponentGuess(row, col);
        markGuess(row, col, hit);
        return hit;
    }

    // updates the board so displays if hit or miss.
    private void markGuess(int row, int col, boolean val)
    {
       
    }

    /*
     * Takes in an opponent guess for a row, col location.
     * Records the guess, and returns a boolean indicating
     * whether the guess was a hit.
     */
    private boolean recordOpponentGuess(int row, int col)
    {
        
    }

    public void printMyShips()
    {
        myGrid.printShips();
    }

    public void printOpponentGuesses()
    {
        myGrid.printStatus();
    }

    public void printMyGuesses()
    {
        opponentGrid.printStatus();
    }

    public void printHitsDelivered()
    {
        System.out.println("Total Hits = " + totalHitsDelivered + " out of " + MAX_HITS);
    }

    public boolean hasWon()
    {
        return totalHitsDelivered == MAX_HITS;
    }

    public boolean hasLost()
    {
        return totalHitsTaken == MAX_HITS;
    }

    public void chooseShipLocation(Ship s, int row, int col, int direction)
    {
        
    }
}
