/*Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
elements. */

public class EvenElementPrinter {
    public static void main(String[] args) {
        // Input array of integers
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        
        System.out.println("Even elements in the array:");
        // Loop through each element in the array using foreach loop
        for (int num : array) {
            // Check if the element is even
            if (num % 2 == 0) {
                // Print even element
                System.out.println(num);
            }
        }
    }
}
