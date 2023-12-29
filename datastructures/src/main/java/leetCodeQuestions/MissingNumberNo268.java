package main.java.leetCodeQuestions;

public class MissingNumberNo268 {
    public static void main(String[] args) {
        int i = missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(i);
    }

    public static int missingNumber(int[] nums) {
        int sum = (nums.length * (nums.length + 1)) / 2;
        for (int num : nums) {
            sum = sum - num;
        }
        return sum;
    }
}
