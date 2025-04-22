package IntegerProgram;

public class SortingOfAnArray {

    public static void main(String[] args) {
        int[] input = {12, 34, 6, 44, 2,6,55, 4, 5, 1};

        int maxIndex = 0;
        int minIndex = 0;
        
        // Find the max and min numbers with their indices
        for (int i = 0; i < input.length; i++) {
            if (input[i] > input[maxIndex]) {
                maxIndex = i;
            }
            if (input[i] < input[minIndex]) {
                minIndex = i;
            }
        }

        // Place the minimum number right after the max number
        int minValue = input[minIndex];

        // Shift elements after maxIndex to the right by one index
        for (int i = minIndex; i > maxIndex + 1; i--) {
            input[i] = input[i - 1];
        }

        // Place the minimum number after the max
        input[maxIndex + 1] = minValue;

        // Print the final array
        for (int num : input) {
            System.out.print(num + " ");
        }
    }
}
