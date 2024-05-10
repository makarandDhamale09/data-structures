package leetCodeQuestions;

public class BestTimeToBuySellStock {
  public static void main(String[] args) {
    System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
  }

  public static int maxProfit(int[] prices) {
    int l = 0;
    int r = 1;
    int maxP = 0;
    while (r < prices.length) {
      if (prices[l] < prices[r]) {
        int profit = prices[r] - prices[l];
        maxP = Math.max(profit, maxP);
      } else {
        l = r;
      }
      r++;
    }
    return maxP;
  }
}
