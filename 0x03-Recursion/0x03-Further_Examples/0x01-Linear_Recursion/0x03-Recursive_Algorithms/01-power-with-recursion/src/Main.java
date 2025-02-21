public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---------------------------------------------------------");

        // The binary search function using recursion
        int number = 5;
        int index = 3;
        int power = power(number, index);
        System.out.println("'" + number + "' raised to the power " +
                "of '" + index + "' is -> '" + power + "'");

    }

    private static int power(int base, int index) {
        if (index == 0) {
            return 1;
        } else {
            return power(base, index  - 1) * base;
        }
    }
}
