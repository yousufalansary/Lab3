import java.util.ArrayList;
import java.util.Collections;

public class Sorter {
    public static void main(String[] args) {
        int[] nums = new int[30];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * 30);
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
        nums = doSelectionSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int[] doSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i;
            // find position of smallest num between (i + 1)th element and last element
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos])
                    pos = j;
    
                // Swap min (smallest num) to current position on array
                int min = arr[pos];
                arr[pos] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }
}
