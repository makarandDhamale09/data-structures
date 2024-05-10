package recursion;

public class PowerOfNumber {
  public static void main(String[] args) {
    System.out.println(powerOfNum(2, 4));
  }

  public static int powerOfNum(int n, int p) {
    if (p < 0) return -1;
    if (p == 0) return 1;
    return n * powerOfNum(n, p - 1);
  }
}
