package SearchAlgorithm;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int res = binarySearch(arr, 11);
    System.out.println(res);
  }

  public static int binarySearch(int[] arr, int value) {
    return binarySearch(arr, value, 0, arr.length - 1);
  }

  private static int binarySearch(int[] arr, int value, int leftIndex, int rightIndex) {
    int midIndex = (leftIndex + rightIndex) / 2;
    if (leftIndex == rightIndex && arr[midIndex] != value) {
      return -1;
    }
    if (arr[midIndex] == value) {
      return midIndex;
    } else if (arr[midIndex] < value) {
      return binarySearch(arr, value, midIndex + 1, rightIndex);
    } else if (arr[midIndex] > value) {
      return binarySearch(arr, value, leftIndex, midIndex - 1);
    }
    return -1;
  }
}
