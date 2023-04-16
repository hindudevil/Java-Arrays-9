/*Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method
for calculating the minimum element. */

public class MinimumElementCalculator {
    public static void main(String[] args) {
        // Input array of integers
        int[] array = {2, -3, 5, 8, 1, 0, -4};
        
        // Initialize minimum element to the first element of the array
        int min = array[0];
        
        // Loop through the array and update minimum element if a smaller value is found
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        System.out.println("Minimum element in the array: " + min);
    }
}
