package GameCompany;

public class GameEntry {

    private String name = null;         // the score value
    private int score = 0;              // name of the person earning this score

    /* Constructs a game entry with given parameters */
    public GameEntry(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /* Getters */
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    /* toString */
    @Override
    public String toString() {
        return "(" + name + ", " + score + ")";
    }
}
