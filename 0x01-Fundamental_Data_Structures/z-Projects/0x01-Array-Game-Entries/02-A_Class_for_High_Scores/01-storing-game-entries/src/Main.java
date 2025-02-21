import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---------------------------------------------------------");
        double[] myList;
        myList = new double[] {22.1, 34.2, 64.3, 27, 26.5};

        /*
         * Printing array
         */
        printArray(myList);

    }

    private static void printArray(double... temperature) {
        System.out.println("Printing the array:");
        for(int i = 0; i < temperature.length; i++) {
            System.out.println(temperature[i]);
        }
    }
}