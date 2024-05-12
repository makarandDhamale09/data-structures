package sortAlgorithm;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    SelectionSort ss = new SelectionSort();
    int[] arr = {10, 5, 30, 15, 50, 6};

    ss.selectionSort(arr);
    ss.printArray(arr);
  }

  private void selectionSort(int[] arr) {

    // loop through 0 to N of array
    for (int j = 0; j < arr.length; j++) {

      // Index of minimum number
      int minimumIndex = j;

      // find the index of minimum number in the remaining array i.e. j+1
      for (int i = j + 1; i < arr.length; i++) {
        if (arr[i] < arr[minimumIndex]) {
          minimumIndex = i;
        }
      }

      // swap the smallest number with the j indexed number
      if (minimumIndex != j) {
        int temp = arr[j];
        arr[j] = arr[minimumIndex];
        arr[minimumIndex] = temp;
      }
    }
  }

  private void printArray(int[] arr) {
    System.out.println(Arrays.toString(arr));
  }
}
