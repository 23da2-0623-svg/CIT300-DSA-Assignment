import java.util.Arrays;

public class SearchingOperations {

    // Linear Search
    public static void linearSearch(int[] arr, int size, int target) {
        int steps = 0;
        boolean found = false;
        long startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            steps++;
            if (arr[i] == target) {
                found = true;
                long endTime = System.nanoTime();
                System.out.println("Linear Search: Element " + target + " found at index " + i);
                System.out.println("Steps taken: " + steps);
                System.out.println("Execution Time: " + (endTime - startTime) + " ns");
                return;
            }
        }

        long endTime = System.nanoTime();
        if (!found) {
            System.out.println("Linear Search: Element " + target + " not found.");
            System.out.println("Steps taken: " + steps);
            System.out.println("Execution Time: " + (endTime - startTime) + " ns");
        }
    }

    // Binary Search
    public static void binarySearch(int[] arr, int size, int target) {
        int[] sortedArr = Arrays.copyOf(arr, size);
        Arrays.sort(sortedArr); // Binary search requires sorted array

        System.out.print("Sorted Array for Binary Search: ");
        for (int val : sortedArr) {
            System.out.print(val + " ");
        }
        System.out.println();

        int low = 0;
        int high = size - 1;
        int steps = 0;
        long startTime = System.nanoTime();

        while (low <= high) {
            steps++;
            int mid = low + (high - low) / 2;

            if (sortedArr[mid] == target) {
                long endTime = System.nanoTime();
                System.out.println("Binary Search: Element " + target + " found at sorted index " + mid);
                System.out.println("Steps taken: " + steps);
                System.out.println("Execution Time: " + (endTime - startTime) + " ns");
                return;
            }

            if (sortedArr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long endTime = System.nanoTime();
        System.out.println("Binary Search: Element " + target + " not found.");
        System.out.println("Steps taken: " + steps);
        System.out.println("Execution Time: " + (endTime - startTime) + " ns");
    }
}
