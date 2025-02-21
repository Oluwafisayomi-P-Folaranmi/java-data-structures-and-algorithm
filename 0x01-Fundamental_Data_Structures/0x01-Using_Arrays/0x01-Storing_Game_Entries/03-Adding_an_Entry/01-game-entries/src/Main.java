import GameCompany.GameEntry;
import GameCompany.Scoreboard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---------------------------------------------------------");

        Scoreboard scoreboard = new Scoreboard(3);
        GameEntry gameEntry1 = new GameEntry("folly", 3);
        GameEntry gameEntry2 = new GameEntry("doyin", 5);
        GameEntry gameEntry3 = new GameEntry("bolu", 6);

        /*
         * Testing the `add(GameEntry g)` method
         */
        // Add the sufficient game entries.
        // 3 game entries due to the capacity.
        scoreboard.add(gameEntry1);
        scoreboard.add(gameEntry2);
        scoreboard.add(gameEntry3);
        System.out.println("The scoreboard is:");
        for(int i = 0; i < scoreboard.getBoard().length; i++) {
            System.out.println(scoreboard.getBoard()[i]);
        }

        // Add a fourth game entry of score = 7
        scoreboard.add(new GameEntry("Wole", 7));
        System.out.println("\nThe scoreboard after another `add` is:");
        for(int i = 0; i < scoreboard.getBoard().length; i++) {
            System.out.println(scoreboard.getBoard()[i]);
        }
    }
}
