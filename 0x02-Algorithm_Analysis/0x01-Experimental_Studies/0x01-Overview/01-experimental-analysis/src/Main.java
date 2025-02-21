public class Main {
    public static void main(String[] args) {

        // Test: 50,000; 100,000; 200,000; 400,000; 800,000;
        //       1,600,000; 3,200,000; 6,400,000; 12,800,000; ...
        int numberOfInput = 800000;

        /*
        * For the first algorithm
        * Uses repeated concatenation to compose
        * a String with n copies of character c
        */
        long startTime1 = System.currentTimeMillis();
        String getRepeat001 = repeat001("*", numberOfInput);
        long endTime1 = System.currentTimeMillis();
        long elapsed1 = (endTime1 - startTime1);
        // Information:
        System.out.println("----------------------------------------");
        System.out.println("For a 'number of input' of '" + numberOfInput +
                "',\n'getRepeat001' ran for '" + elapsed1 +
                "' millisecond" + ((elapsed1 > 1) ? "s" : "") + '\n');

        /*
         * For the second algorithm
         * Uses StringBuilder to compose
         * a String with n copies of character c.
         */
        long startTime2 = System.currentTimeMillis();
        String getRepeat002 =repeat002("*", numberOfInput);
        long endTime2 = System.currentTimeMillis();
        long elapsed2 = (endTime2 - startTime2);
        // Information:
        System.out.println("----------------------------------------");
        System.out.println("For a 'number of input' of '" + numberOfInput +
                "',\n'getRepeat002' ran for '" + elapsed2 +
                "' millisecond" + ((elapsed1 > 1) ? "s" : "") + '\n');

    }

    private static String repeat001(String ch, int number) {
        String answer = "";
        for (int i = 0; i <= number; i++) {
            answer += ch;
        }
        return answer;
    }

    private static String repeat002(String ch, int number) {
        StringBuilder answer = new StringBuilder("");
        for (int i = 0; i <= number; i++) {
            answer.append(ch);
        }
        return answer.toString();
    }
}