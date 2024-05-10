package sortAlgorithm;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] numbers = new int[2000000];

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(1000);
    }

    // printarray(numbers);
    System.out.println();
    LocalDateTime start = LocalDateTime.now();
    quicksort(numbers);
    LocalDateTime end = LocalDateTime.now();
    System.out.println(ChronoUnit.MILLIS.between(start, end));
    // printarray(numbers);
  }

  public static void quicksort(int[] arr) {
    quicksort(arr, 0, arr.length - 1);
  }

  private static void quicksort(int[] array, int lowIndex, int highIndex) {

    if (lowIndex >= highIndex) {
      return;
    }

    // Using Random pivot and swapping it to the last index so the sorting is quicker
    /*int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
    int pivot = array[pivotIndex];
    swap(array, highIndex, pivotIndex);*/

    // Choosing last element as pivot
    int pivot = array[highIndex];

    int leftPointer = partion(array, lowIndex, highIndex, pivot);

    quicksort(array, lowIndex, leftPointer - 1);
    quicksort(array, leftPointer + 1, highIndex);
  }

  private static int partion(int[] array, int lowIndex, int highIndex, int pivot) {
    int leftPointer = lowIndex;
    int rightPointer = highIndex;

    while (leftPointer < rightPointer) {

      while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
        leftPointer++;
      }

      while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
        rightPointer--;
      }

      swap(array, leftPointer, rightPointer);
    }
    swap(array, leftPointer, highIndex);
    return leftPointer;
  }

  private static void swap(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }

  private static void printarray(int[] arr) {
    Arrays.stream(arr).forEach(c -> System.out.print(c + " "));
  }
}
