import java.util.ArrayList;
import java.util.Collections;

public class Sorter {
    public static void main(String[] args) {
        double[] nums = new double[30];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.random() * 30;
        }
        System.out.println(nums);
        doSelectionSort(nums);
        System.out.println(nums);
    }
    public static double[] doSelectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i;
            // find position of smallest num between (i + 1)th element and last element
            for (int j = i + 1; j <= arr.length; j++) {
                if (arr[j] < arr[pos])
                    pos = j;
    
                // Swap min (smallest num) to current position on array
                double min = arr[pos];
                arr[pos] = arr[i];
                arr[i] = min;
            }
        }
        return arr;
    }
}
