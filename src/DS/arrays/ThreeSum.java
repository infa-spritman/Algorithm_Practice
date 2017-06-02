package DS.arrays;

import java.util.*;

/**
 * Created by Sushant on 6/2/2017.
 */
public class ThreeSum {

    public static Map<Integer, List<List<Integer>>> threeSum(int[] nums) {
        Map<Integer, List<List<Integer>>> sumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int tempSum = nums[i] + nums[j];
                if (sumMap.containsKey(tempSum)) {
                    List<List<Integer>> lists = sumMap.get(tempSum);
                    if (!lists.contains(new ArrayList<>(Arrays.asList(nums[i], nums[j]))))
                        lists.add(new ArrayList<>(Arrays.asList(nums[i], nums[j])));
                    sumMap.put(tempSum, lists);
                } else {
                    List<List<Integer>> lists = new LinkedList<>();
                    lists.add(new ArrayList<>(Arrays.asList(nums[i], nums[j])));
                    sumMap.put(tempSum, lists);
                }

            }
        }
        return sumMap;
    }


    public static void main(String[] args) {

        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

}
