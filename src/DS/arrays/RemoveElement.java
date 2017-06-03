package DS.arrays;

/**
 * Created by Sushant on 6/2/2017.
 */
public class RemoveElement {

    private static int removeElement(int[] nums, int val) {

        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[start++] = nums[i];


        }
        return start;
    }


    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2, 2, 3, 5, 2, 3, 5}, 5));
    }
}
