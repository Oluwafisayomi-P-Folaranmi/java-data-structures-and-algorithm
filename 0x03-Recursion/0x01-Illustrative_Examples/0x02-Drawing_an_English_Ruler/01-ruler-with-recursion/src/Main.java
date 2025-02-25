public class Main {

    public static void main(String[] args) {

        drawRuler(3, 3);

    }

    public static void drawRuler(int nInches, int majorLength) {
        // draw inch 0 line and label
        drawLine(majorLength, 0);
        for (int j = 1; j <= nInches; j++) {
            // draw interior ticks for inch
            drawInterval(majorLength - 1);
            // draw inch j line and label
            drawLine(majorLength, j);
        }
    }

    private static void drawInterval(int centralLength) {
        if (centralLength >= 1) {
            // recursively draw top interval
            drawInterval(centralLength - 1);
            // draw center tick line (without label)
            drawLine(centralLength);
            // recursively draw bottom interval
            drawInterval(centralLength - 1);
        }
        // otherwise, do nothing
    }

    private static void drawLine(int tickLength, int tickLabel) {
        for (int j = 0; j < tickLength; j++) {
            System.out.print("-");
        }
        if (tickLabel >= 0) {
            System.out.print(" " + tickLabel);
        }
        System.out.print("\n");
    }

    /** Draws a line with the given tick length (but no label). */
    private static void drawLine(int tickLength) {
        drawLine(tickLength, -1);
    }
}
