public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---------------------------------------------------------");

        // The binary search function using recursion
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int sum = linearSum(arr, 5);
        System.out.println("Sum is -> '" + sum + "'");

    }

    /**
     * @param data   // The array to be used
     * @param n      // The length of the array - 1
     * @return sum
     */
    private static int linearSum(int[] data, int n) {
        if (n == 0) {   // i.e., when index = -1
            return 0;
        } else {
            return linearSum(data, n - 1) + data[n - 1];
        }
    }
}
