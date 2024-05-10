package leetCodeQuestions;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
  public static void main(String[] args) {
    System.out.println(Arrays.toString(product(new int[] {1, 2, 3, 4})));
  }

  public static int[] product(int[] nums) {
    int[] answer = new int[nums.length];
    answer[0] = 1;
    int prod = nums[nums.length - 1];
    for (int i = 1; i < nums.length; i++) {
      answer[i] = nums[i - 1] * answer[i - 1];
    }
    for (int i = nums.length - 2; i >= 0; i--) {
      answer[i] = prod * answer[i];
      prod = prod * nums[i];
    }
    return answer;
  }
}
