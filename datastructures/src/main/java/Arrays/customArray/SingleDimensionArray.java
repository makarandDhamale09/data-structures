package Arrays.customArray;

import java.util.Arrays;

/**
 * This is a Custom array class with different functions to process the array
 *
 * <p>TODO : Create a generic class and not a int class.
 */
public class SingleDimensionArray {
  private final int[] arr;

  public SingleDimensionArray(int sizeOfArray) {
    arr = new int[sizeOfArray];
  }

  public void insert(int location, int value) {
    arr[location] = value;
  }

  public String toString() {
    return Arrays.toString(arr);
  }

  public void traverseArray() {
    try {
      for (int i = 0; i < arr.length; i++) {
        if (i < arr.length - 1) {
          System.out.print(arr[i] + " ");
        } else {
          System.out.println(arr[i]);
        }
      }
    } catch (Exception e) {
      System.out.println("ARray no longer exists");
    }
  }

  public void searchInArray(int value) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {
        System.out.println(value + " present at index " + i);
        return;
      }
    }
    System.out.println(value + " not found");
  }
}
