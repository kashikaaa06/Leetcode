class Solution {
    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) {
            return 0;
        }
        
        int bp = prices[0];  // ✅ Set buying price to first day
        int maxprofit = 0;
        
        for(int i = 1; i < prices.length; i++) {
            if(bp < prices[i]) {
                int profit = prices[i] - bp;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                bp = prices[i];
            }
        }
        return maxprofit;
    }
    
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));  // Output: 5
    }
}