import GameCompany.GameEntry;
import GameCompany.Scoreboard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---------------------------------------------------------");

        // The Factorial function using recursion
        int number = 5;
        int theFactorialOfANumber;
        theFactorialOfANumber = factorial(number);
        System.out.println("The factorial of '" +
                number + "' is '" + theFactorialOfANumber + "'");

    }

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException("The argument should be: o <= n >= 1");
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
