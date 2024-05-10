package recursion;

public class DecimalToBinary {
  public static void main(String[] args) {
    System.out.println(decimalToBinary(145));
  }

  public static int decimalToBinary(int n) {
    if (n < 0) return -1;
    if (n == 1) return 1;
    return n % 2 + decimalToBinary(n / 2) * 10;
  }
}
