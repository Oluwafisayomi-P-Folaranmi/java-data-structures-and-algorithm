import GameCompany.GameEntry;
import GameCompany.Scoreboard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---------------------------------------------------------");

        // The binary search function using recursion
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int targetData = 0;
        boolean present = binarySearch(arr, targetData, 0, arr.length - 1);
        System.out.println("'" + targetData + "' is present in the array -> '" +
                present + "'");

    }

    private static boolean binarySearch(int[] data, int target, int low, int high) {
        if (low > high) {
            return false;
        }
        else {
            int mid = (low + high) / 2;
            if (target == data[mid]) {
                return true;
            } else if (target < data[mid]) {
                return binarySearch(data, target, low, mid - 1);
            } else {
                return binarySearch(data, target, mid + 1, high);
            }
        }
    }
}
