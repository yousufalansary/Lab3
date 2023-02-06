
public class Sorter {
    public static void main(String[] args) {
        int[] nums = new int[30];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.round(Math.random() * 100));
        }
        System.out.println("Original Array");
        printArray(nums);
        System.out.println("Selection Sort Array");
        selectionSort(nums);
        printArray(nums);
        System.out.println("Insertion Sort Array");
        insertionSort(nums);
        printArray(nums);
        System.out.println("Sort method that calls insertion Sort method");
        sort(nums);
        printArray(nums);
    }

    public static void sort(int[] array) {
        insertionSort(array);
    }


    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
    
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }


    public static void selectionSort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
 
    // Prints the array
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
