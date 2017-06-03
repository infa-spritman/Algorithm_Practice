package DS.arrays;

import java.util.Arrays;

/**
 * Created by Sushant on 6/2/2017.
 */
public class ThreeSumClosest {

    private static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum_closest = 99999999;
        for (int i = 0; i < nums.length - 2; i++) {

            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                if (nums[i] + nums[low] + nums[high] == target) {
                    sum_closest = target;
                    break;

                } else if (nums[i] + nums[low] + nums[high] > target) {

                    if (Math.abs(nums[i] + nums[low] + nums[high] - target) <
                            Math.abs(sum_closest - target))
                        sum_closest = nums[i] + nums[low] + nums[high];
                    high--;

                } else {
                    if (Math.abs(nums[i] + nums[low] + nums[high] - target) <
                            Math.abs(sum_closest - target))
                        sum_closest = nums[i] + nums[low] + nums[high];
                    low++;
                }

            }

        }
        return sum_closest;
    }

    public static void main(String[] args) {

        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}
