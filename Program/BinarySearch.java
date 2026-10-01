import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements (will be sorted automatically):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Binary search requires a sorted array
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        
        int left = 0;
        int right = n - 1;
        boolean found = false;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == target) {
                System.out.println("Element " + target + " found at index " + mid + " (in sorted array).");
                found = true;
                break;
            }
            
            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
        
        scanner.close();
    }
}
