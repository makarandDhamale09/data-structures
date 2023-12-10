package leetCodeQuestions;

import java.util.Arrays;

/**
 * The frequency of an element is the number of times it occurs in an array.
 *
 * <p>You are given an integer array nums and an integer k. In one operation, you can choose an
 * index of nums and increment the element at that index by 1.
 *
 * <p>Return the maximum possible frequency of an element after performing at most k operations.
 *
 * <p>
 *
 * <p>
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [1,2,4], k = 5 Output: 3 Explanation: Increment the first element three times
 * and the second element two times to make nums = [4,4,4]. 4 has a frequency of 3.
 */
public class FrequencyOfNumber {
    public static void main(String[] args) {
        FrequencyOfNumber frequencyOfNumber = new FrequencyOfNumber();
        int[] nums = {3, 9, 6};
        int i = frequencyOfNumber.maxFrequency(nums, 2);
        System.out.println("Final Count : " + i);
    }

    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int currentCount = 0;
        int finalCount = 0;
        System.out.println(Arrays.toString(nums));
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if ((nums[i] - nums[j]) < k) {
                    currentCount++;
                }
            }
            finalCount = Math.max(currentCount, finalCount);
        }
        return finalCount;
    }
}
