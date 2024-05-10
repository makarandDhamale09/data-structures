package Problems;

public class ReverseANumber {
  public static void main(String[] args) {
    int num = 12345;
    reverseNumber(num);
  }

  public static int reverseNumber(int num) {
    int reverseNum = 0;
    while (num != 0) {
      reverseNum = reverseNum * 10 + num % 10;
      num = num / 10;
    }
    return reverseNum;
  }
}
