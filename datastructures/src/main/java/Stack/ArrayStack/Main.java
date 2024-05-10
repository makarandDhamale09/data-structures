package Stack.ArrayStack;

public class Main {
  public static void main(String[] args) {
    ArrayStack stack = new ArrayStack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);

    int res = stack.peek();
    System.out.println(res);
    System.out.println(stack.peek());
    stack.deleteStack();
  }
}
