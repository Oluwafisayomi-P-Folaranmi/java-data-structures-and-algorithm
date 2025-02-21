package GameCompany;

/**
 * Class for storing high scores in an array in non-decreasing order.
 */
public class Scoreboard {

    private int numEntries = 0;             // number of actual entries
    private GameEntry[] board;              // array of game entries (names & scores)

    public Scoreboard(int capacity) {
        this.board = new GameEntry[capacity];
    }
}
