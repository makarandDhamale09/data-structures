package Stack.Questions;

import java.util.Arrays;

public class ThreeInOne {
  private final int numberOfStacks = 3;
  private int stackCapacity;
  private final int[] values;
  private final int[] sizes;

  public ThreeInOne(int stackSize) {
    values = new int[stackSize];
    sizes = new int[numberOfStacks];
    for (int i = 0; i < 2; i++) {
      sizes[i] = stackSize / numberOfStacks;
    }
    sizes[2] = stackSize - (sizes[0] + sizes[1]);

    System.out.println(Arrays.toString(sizes));
  }

  // isFull
  public boolean isFull(int stackNum) {
    int size = sizes[stackNum - 1];
    if (stackNum * size != 0) {
      System.out.println("Stack " + stackNum + " is full");
      return true;
    }
    return false;
  }

  // isEmpty
  public boolean isEmpty(int stackNum) {
    int size = sizes[stackNum - 1];
    if (stackNum * size - size == 0) {
      System.out.println("Stack " + stackNum + " is empty");
      return true;
    }
    return false;
  }

  // indexOfTop - this is helper method for push, pop and peek methods

  private int indexOfTop(int stackNum) {
    int size = sizes[stackNum - 1];
    int index = stackNum * size - size;
    if (!isFull(stackNum)) {
      while (index != 0 || index < stackNum * size) {
        index++;
      }
      return index;
    }
    return -1;
  }

  // push
  public void push(int stackNum, int value) {}

  /*
  // pop
  public int pop(int stackNum) {
      // TODO
  }

  // peek

  public int peek(int stackNum) {
      // TODO
  }*/

}
