package main.java.Arrays;

public class MissingNumber {

  int missingNumber;

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
    MissingNumber mn = new MissingNumber();
    mn.missingNumber(arr);
    System.out.println(String.valueOf(mn.missingNumber));
  }

  public void missingNumber(int[] intArray) {
    for (int i = 0; i < intArray.length; i++) {
      if (intArray[i] != i + 1) {
        missingNumber = i + 1;
        return;
      }
    }
  }
}
