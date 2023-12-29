package leetCodeQuestions;

// NOTE: 153. Find Minimum in Rotated Sorted Array
/**
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For
 * example, the array nums = [0,1,2,4,5,6,7] might become:
 *
 * <p>[4,5,6,7,0,1,2] if it was rotated 4 times. [0,1,2,4,5,6,7] if it was rotated 7 times. Notice
 * that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0],
 * a[1], a[2], ..., a[n-2]].
 *
 * <p>Given the sorted rotated array nums of unique elements, return the minimum element of this
 * array.
 *
 * <p>You must write an algorithm that runs in O(log n) time.
 */
public class FindMinInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr) {
        int num = arr[0];
        for (int i : arr) {
            if (num > i) {
                return i;
            }
            num = i;
        }
        return num;
    }
}
