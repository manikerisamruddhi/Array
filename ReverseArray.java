public class ReverseArray {

    public void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp;
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // To add a newline after printing the array
    }

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        int arr[] = new int[] { 1,2, 3, 4, 5 };
        int start = 0;
        int n = arr.length;
        r.reverse(arr, start, n - 1);
        System.out.println("Reversed array is:");
        r.printArray(arr, n);  // Pass 'n' instead of 'n-1' to print the entire array
    }
}
