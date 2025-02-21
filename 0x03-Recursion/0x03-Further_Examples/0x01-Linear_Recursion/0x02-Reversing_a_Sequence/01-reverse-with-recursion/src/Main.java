public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("---------------------------------------------------------");

        // The binary search function using recursion
        int[] arr = new int[] {1, 2, 3, 4, 5};
        System.out.println("Before reverse: ");
        for (int item : arr) {
            System.out.println(item + ", ");
        }

        reverseArray(arr, 0, arr.length - 1);

        System.out.println("\nAfter reverse: ");
        for (int item : arr) {
            System.out.println(item + ", ");
        }

    }

    private static void reverseArray(int[] data, int low, int high) {
        if (low < high) {   // if at least two elements in subarray
            int temp = data[low];
            data[low] = data[high];
            data[high] = temp;
            reverseArray(data, low + 1, high - 1);
        }
    }
}
