import java.util.ArrayList;
import java.util.Collections;

public class Sorter {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            nums.add(i);
        }
        Collections.shuffle(nums);
    }
}
