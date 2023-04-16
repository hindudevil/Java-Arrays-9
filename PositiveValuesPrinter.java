/*Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array. */

public class PositiveValuesPrinter {
    public static void main(String[] args) {
        // Input array
        int[] arr = {2, 6, -5, -1, 0, 4, -9};
        
        System.out.println("Positive values in the array:");
        // Loop through each element in the array
        for (int num : arr) {
            // Check if the number is positive
            if (num > 0) {
                // Print positive values
                System.out.println(num);
            }
        }
    }
}
