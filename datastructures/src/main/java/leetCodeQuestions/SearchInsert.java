package leetCodeQuestions;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in order.
 *
 * <p>You must write an algorithm with O(log n) runtime complexity. Example 1:
 *
 * <p>Input: nums = [1,3,5,6], target = 5 Output: 2
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int val) {
        /*1,2,3,4,5,6
        l= 0, r = 5

        p = l+r/2 = 2
        num[2]>5
        l=p

        2+5/2
        nums[3]>5
        l=p

        3+5/2
        nums[4]>5
        r=p
        if(l+1==r){
            return r
        }
        */
        int l = 0;
        int r = nums.length;
        int p;
        while (l + 1 != r) {
            p = (l + r) / 2;
            int temp = nums[p];
            if (temp > val) {
                r = p;
            } else {
                l = p;
            }
        }
        if (nums[l] < val) {
            return l + 1;
        }
        return l;
    }
}
