package leetCodeQuestions;

/*
An array is given in a non-decreasing order return the index of Number in the array or
else if not present return -1
 */
public class ZalandoQuestion1 {

  public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5};
    int solution = solution(A, 5);
    System.out.println(solution);
  }

  public static int solution(int[] A, int X) {
    int N = A.length;
    if (N == 0) {
      return -1;
    }

    int l = 0;
    int r = N - 1;
    while (l < r) {
      int m = (l + r) / 2;
      if (A[m] > X) {
        r = m - 1;
      } else {
        l = m + 1;
      }
    }
    if (l > 0 && A[l - 1] == X) {
      return l - 1;
    }
    return -1;
  }
}
