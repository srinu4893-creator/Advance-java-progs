// 7. SEARCH A GIVEN ELEMENT FROM AN ARRAY OF ELEMENTS
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                System.out.println("Element " + target + " found at index " + i + ".");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
        scanner.close();
    }
}
