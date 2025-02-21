package GameCompany;

import java.util.Arrays;

/**
 * Class for storing high scores in an array in non-decreasing order.
 *
 *
 * CHECK THE README FOR EXPLANATION OF SOME CONCEPTS!!!
 * CHECK THE README FOR EXPLANATION OF SOME CONCEPTS!!!
 * CHECK THE README FOR EXPLANATION OF SOME CONCEPTS!!!
 *
 */
public class Scoreboard {

    private int numEntries = 0;             // number of actual entries
    private GameEntry[] board;              // array of game entries (names & scores)

    public Scoreboard(int capacity) {
        this.board = new GameEntry[capacity];
    }

    // Getters
    public int getNumEntries() {
        return numEntries;
    }

    public GameEntry[] getBoard() {
        return board;
    }

    /**
     * Add an entry
     */
    public void add(GameEntry g) {
        int newScore = g.getScore();
        // When can we really add an entry?
        if(numEntries<board.length||newScore>board[numEntries - 1].getScore()){
            if(numEntries<board.length)     // no score drops from the board
                numEntries++;               // so overall number increases
            // shift any lower scores rightward to make room for the new entry
            int j=numEntries - 1;
            while(j > 0 && board[j - 1].getScore()<newScore){
                board[j] = board[j - 1]; //shift entry from j-1 to j
                j--; //and decrement j
            }
            board[j] = g; //when done, add new entry
        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        GameEntry gameEntry = board[i];
        if (i > 0 && i <= this.numEntries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);
        for(int j = i; j < numEntries; j++) {
            board[j] = board[j + 1];
        }
        board[numEntries - 1] = null;
        this.numEntries--;
        return gameEntry;
    }

    // toString
    @Override
    public String toString() {
        return "Scoreboard{" +
                "numEntries=" + numEntries +
                ", board=" + Arrays.toString(board) +
                '}';
    }
}
