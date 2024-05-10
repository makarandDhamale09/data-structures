package Problems;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargestNumber {
  public static void main(String[] args) {
    int[] arr = {2, 3, 6, 7, 9, 3, 4, 0, 1, 9, 8};

    Integer second =
        Arrays.stream(arr)
            .sequential()
            .boxed()
            .sorted(Comparator.reverseOrder())
            .distinct()
            .skip(1)
            .findFirst()
            .get();

    System.out.println(second);
  }
}
