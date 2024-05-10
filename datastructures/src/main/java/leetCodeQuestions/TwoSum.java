package leetCodeQuestions;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 *
 * <p>You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 *
 * <p>You can return the answer in any order.
 *
 * <p>Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because nums[0] + nums[1] ==
 * 9, we return [0, 1].
 *
 * <p>Constraints:
 *
 * <p>2 <= nums.length <= 104 -109 <= nums[i] <= 109 -109 <= target <= 109 Only one valid answer
 * exists.
 */
public class TwoSum {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSumHashMap(new int[] {2, 7, 11, 15}, 9)));
  }

  public static int[] twoSumHashMap(int[] nums, int target) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    int num2;
    Integer index2;
    for (int i = 0; i < nums.length; i++) {
      num2 = target - nums[i];
      index2 = hashMap.get(num2);
      if (index2 != null) {
        return new int[] {index2, i};
      }
      hashMap.put(nums[i], i);
    }
    return null;
  }

  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] {i, j};
        }
      }
    }
    return null;
  }
}
