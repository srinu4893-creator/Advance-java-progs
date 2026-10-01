import java.util.Scanner;

public class SumAverageArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Array must have at least one element.");
            return;
        }
        
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        
        double average = (double) sum / n;
        
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        
        scanner.close();
    }
}
