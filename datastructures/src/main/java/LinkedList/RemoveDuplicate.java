package LinkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicate {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 5));
    deleteDups(ll);
    System.out.println(ll);
  }

  public static void deleteDups(LinkedList<Integer> ll) {
    Set<Integer> integerSet = new HashSet<>();
    for (int i = 0; i < ll.size(); i++) {
      if (!integerSet.add(ll.get(i))) {
        ll.remove(i);
        i--;
      }
    }
  }
}
