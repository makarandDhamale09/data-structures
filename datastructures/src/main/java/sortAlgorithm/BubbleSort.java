package sortAlgorithm;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    BubbleSort bs = new BubbleSort();
    int[] arr = {10, 5, 30, 15, 50, 6};
    bs.bubbleSort(arr);
    bs.printArray(arr);
  }

  void bubbleSort(int[] arr) {
    int n = arr.length;

    // loop through 0 to N of array
    for (int i = 0; i < n - 1; i++) {

      // loop through 0 to N-i array as the biggest number is at the end of the array after each
      // loop, so we are excluding the last number of that array
      for (int j = 0; j < n - i - 1; j++) {

        // swap the numbers
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  void printArray(int[] arr) {
    System.out.println(Arrays.toString(arr));
  }
}
