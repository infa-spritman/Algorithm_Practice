package DS.arrays;

/**
 * Created by Sushant on 6/3/2017.
 */
public class MaximumProductArray {


    public static void main

    public int maxProduct(int[] nums) {

        int preMax = nums[0];
        int preMin = nums[0];
        int maxSoFar = nums[0];
        int localMax, localMin;

        for (int i = 1; i < nums.length; i++) {

            localMax = Math.max(Math.max(preMax * nums[i], preMin * nums[i]), nums[i]);
            localMin = Math.min(Math.min(preMax * nums[i], preMin * nums[i]), nums[i]);
            maxSoFar = Math.max(maxSoFar, localMax);
            preMax = localMax;
            preMin = localMin;

        }

        return maxSoFar;

    }
}
