import java.util.Arrays;

public class KthSmallest {
    public int small(int arr[], int k) {
        // Sorting the array
        Arrays.sort(arr);

        // Printing the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // To move to the next line after printing array

        // Return the k-th smallest element (0-based index, so k-1)
        return arr[k - 1];
    }

    public static void main(String[] args) {
        // Create an instance of KthSmallest
        KthSmallest obj = new KthSmallest();

        // Input array
        int arr[] = {7, 10, 4, 3, 20, 15};

        // k-th smallest element to find
        int k = 4;

        // Print the k-th smallest element
        System.out.println("The " + k + "-th smallest element is: " + obj.small(arr, k));
    }
}
