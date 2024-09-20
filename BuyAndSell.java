public class BuyAndSell {

    public int calculateProfit(int prices[]) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = Integer.MAX_VALUE; // Minimum price to buy
        int maxProfit = 0;                // Maximum profit
        
        // Loop through the prices
        for (int i = 0; i < prices.length; i++) {
            // If we find a price lower than the current minimum, update the minimum price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Calculate profit if sold at the current price and update maxProfit
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        BuyAndSell b = new BuyAndSell();
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + b.calculateProfit(prices));  // Output: 5
    }
}
