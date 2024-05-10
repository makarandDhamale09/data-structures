package leetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class No2739FuelTank {
  public static void main(String[] args) {
    // int solution = solution(9, 1);
    // System.out.println(solution);
    synchronizedList();
  }

  private static int solution(int mainTank, int additionalTank) {
    int dist = 0;
    while (mainTank / 5 >= 1) {
      if (additionalTank >= 1) {
        mainTank = mainTank - 5 + 1;
        additionalTank--;
      } else mainTank = mainTank - 5;
      dist = dist + 50;
    }
    return dist + mainTank * 10;
  }

  private static void synchronizedList() {
    List<Integer> list = Collections.synchronizedList(new ArrayList<>());

    Runnable runnable =
        () -> {
          list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        };

    Thread t1 = new Thread(runnable);
    Thread t2 = new Thread(runnable);
    t1.start();
    t2.start();

    System.out.println(list);

    System.out.println('d' - 'a');
  }
}
