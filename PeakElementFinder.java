/*Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor.
Leftmost and rightmost element cannot be a peak element. */

public class PeakElementFinder {
    public static void main(String[] args) {
        // Input array of integers
        int[] array = {1, 1, 3, 4, 2, 3, 5, 7, 0};

        int peak = findPeakElement(array);

        System.out.println(peak != -1 ? "First peak element in the array: " + array[peak] : "No peak element found in the array.");
    }

    // Function to find the first peak element in the array
    public static int findPeakElement(int[] array) {
        int n = array.length;

        // Loop through the array to find peak element
        for (int i = 1; i < n - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return i;
            }
        }

        // Check if leftmost or rightmost element is a peak
        if (array[0] > array[1]) {
            return 0;
        }
        if (array[n - 1] > array[n - 2]) {
            return n - 1;
        }

        // If no peak element is found, return -1
        return -1;
    }
}
