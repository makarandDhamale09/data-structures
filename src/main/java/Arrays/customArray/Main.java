package Arrays.customArray;

public class Main {
    public static void main(String[] args) {
        SingleDimensionArray s = new SingleDimensionArray(3);
        s.insert(0, 1);
        s.insert(1, 2);
        s.insert(2, 3);

        System.out.println(String.valueOf(s));

        System.out.println("Array Traversal");
        s.traverseArray();

        System.out.println("Search in Array");
        s.searchInArray(2);
    }
}
