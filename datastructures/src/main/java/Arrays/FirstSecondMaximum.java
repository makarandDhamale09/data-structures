package main.java.Arrays;

public class FirstSecondMaximum {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 9, 10, 10, 3, 4, 5};
        System.out.println(firstSecondMax(arr));
    }

    public static String firstSecondMax(int[] arr) {
        int first = 0;
        int second = 0;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                temp = first;
                first = arr[i];
                if (first > second) {
                    second = temp;
                }
            }
        }
        return first + " " + second;
    }
}
