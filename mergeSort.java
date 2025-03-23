import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {

    public static void mergeSort(int arr[], int left, int right) {  // Recursive function for merge sort
       if(left < right) {  // Base condition: Stop when left == right
       int mid = left + (right - left) / 2; // to find the middle index

       //recursively divide the left side
       mergeSort(arr, left, mid);

       //Recursively divide the right half
       mergeSort(arr, mid + 1, right);

       // Merge the sorted halves
       merge(arr, left, mid, right);  // this function keeps splitting the array in half until each part has a single element

       }
    }
    public static void merge(int arr[], int left, int mid, int right) { // merge function
        //find sizes of the two subarrays

        int n1 = mid -left + 1;
        int n2 = right - mid;

        //create temp arrays
        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++){
           leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }   
    //Merge the temp arrays back into arr[left....right]
    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if (leftArray[i] <= rightArray[j]) {
            arr[k] = leftArray[i];
            i++;
         }  else {
            arr[k] = rightArray[j];
            j++;
         }
         k++;
    }

    //Copy remaining elements of leftArray[]
    while (i < n1) {
        arr[k] = leftArray[i];
        i++;
        k++;
    }
    //Copy remaining elements of rightArray[]
    while(j < n2) {
        arr[k] = rightArray[j];
        j++;
        k++;  // this function merge two sorted arrays into one sorted array
    }
        
    } 

    //call merge sort from main function

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();  //taking the size of an array
        int[] arr = new int[n];  //Declaring the array

        System.out.println("Enter the elements : ");
        for( int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt(); // Take array input
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr, 0, n-1);  // call merge sort

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        sc.close();

    }


}