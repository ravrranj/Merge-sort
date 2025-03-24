import java.util.*;

public class mergeSort {

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Find the middle index

            //Recursively divide the left half
            mergeSort(arr, left, mid);

            //Recursively divide the right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int arr[], int left, int mid, int right) {
        //Find sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //Create temporary arrays
        int leftSubArray[] = new int[n1];
        int rightSubArray[] = new int[n2];

        //Copy data to temp arrays
        for(int i = 0; i < n1; i++) {
            leftSubArray[i] = arr[left + i];
        }
        for(int j = 0; j < n2; j++) {
            rightSubArray[j] = arr[mid + 1 + j];
        }
        //Merge the temp arrays back into arr[left...right]
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftSubArray[i] <= rightSubArray[j]) {
                arr[k] = leftSubArray[i];
                i++;
            } else {
                arr[k] = rightSubArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftSubArray[]
        while (i < n1) {
            arr[k] = leftSubArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightSubArray[]
        while(j < n2) {
            arr[k] = rightSubArray[j];
            j++;
            k++;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i=0; i < n; i++) {
            arr[i] = sc.nextInt(); //Take array input
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        sc.close();
    }

}
