package DS.arrays;

/**
 * Created by Sushant on 6/2/2017.
 */
public class RemoveDuplicatesSortedArray {

    private static int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int id = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                nums[id++] = nums[i - 1];
            if (i == (nums.length - 1))
                nums[id++] = nums[i];


        }

        return id;
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 2, 3, 4, 5}));
    }
}
