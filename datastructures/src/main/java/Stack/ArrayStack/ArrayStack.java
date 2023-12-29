package Stack.ArrayStack;

import java.util.EmptyStackException;

public class ArrayStack {
    public int[] arr;
    public int topOfStack;

    public ArrayStack(int size) {
        arr = new int[size];
        topOfStack = -1;
        System.out.println("Stack created of size " + size);
    }

    public boolean isEmpty() {
        return topOfStack == -1;
    }

    public boolean isFull() {
        return topOfStack == arr.length - 1;
    }

    public void push(int value) {
        if (!isFull()) {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Value inserted in stack successfully");
        } else System.out.println("Stack is full!!!");
    }

    public int pop() {
        if (!isEmpty()) {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
        throw new EmptyStackException();
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[topOfStack];
        }
        throw new EmptyStackException();
    }

    public void deleteStack() {
        arr = null;
        System.out.println("Stack deleted successfully!!!");
    }
}
