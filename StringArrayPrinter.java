/*Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
strings stored on odd indices of the array. */

public class StringArrayPrinter {
    public static void main(String[] args) {
        // Input array of strings
        String[] stringArray = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        
        System.out.println("Strings at odd indices in the array:");
        // Loop through each element in the array and print string at odd indices
        for (int i = 1; i < stringArray.length; i +=2) {
            System.out.println(stringArray[i]);
        }
    }
}
