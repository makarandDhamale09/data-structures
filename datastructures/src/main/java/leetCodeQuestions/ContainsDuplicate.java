package leetCodeQuestions;

import java.util.HashSet;

public class ContainsDuplicate {
  public static void main(String[] args) {
    System.out.println(containsDuplicates(new int[] {1, 2, 3, 4}));
  }

  public static boolean containsDuplicates(int[] arr) {
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i : arr) {
      if (!hashSet.add(i)) {
        return true;
      }
    }
    return false;
  }
}
