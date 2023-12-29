package leetCodeQuestions;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the
 * ith digit of the integer. The digits are ordered from most significant to least significant in
 * left-to-right order. The large integer does not contain any leading 0's.
 *
 * <p>Increment the large integer by one and return the resulting array of digits.
 *
 * <p>Example 1:
 *
 * <p>Input: digits = [1,2,3] Output: [1,2,4] Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1,2,4].
 */
class PlusOne {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 2};
        System.out.println(Arrays.toString(plusOne(nums)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
