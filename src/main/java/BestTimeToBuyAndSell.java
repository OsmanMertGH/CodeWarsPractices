public class BestTimeToBuyAndSell {

    public static void main(String[] args) {

        int[] prices1 = {7, 1, 5, 2, 6, 4};
        int maxProfit1 = maxProfit(prices1);
        System.out.println(maxProfit1);

        int[] prices2 = {7, 6, 4, 3, 1};
        int maxProfit2 = maxProfit(prices2);
        System.out.println(maxProfit2);
    }

    public static int maxProfit(int[] prices) {

        int buyMinPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyMinPrice) {
                buyMinPrice = prices[i];
            } else if (prices[i] - buyMinPrice > maxProfit) {
                maxProfit = prices[i] - buyMinPrice;
            }
        }

        return maxProfit;
    }
}
