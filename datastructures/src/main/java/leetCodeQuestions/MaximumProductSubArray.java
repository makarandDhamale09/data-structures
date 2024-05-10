package leetCodeQuestions;

public class MaximumProductSubArray {
  public static void main(String[] args) {
    int[] nums = {-1, -3, -1};
    int result = maxProdSubArray(nums);
    System.out.println(result);
  }

  public static int maxProdSubArray(int[] nums) {
    int maxProd = nums[0];
    int prod = 1;
    for (int i : nums) {
      prod = prod * i;
      if (prod < 0) {
        prod = 1;
      }
      maxProd = Math.max(prod, maxProd);
    }
    return maxProd > 0 ? maxProd : 0;
  }
}
