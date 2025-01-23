package data-structures-and-algorithms.week-28;

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int days = prices.length;
        int profit = 0;

        for (int i = 0; i< days - 1; i++) {
            if (prices[i] < prices(i+1)) {
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }

    }

    int days = prices.length;
    int profit = 0;
    int buy_day = 0;
int sell_day = 0;

    while(buy_day<days&&sell_day<days)
    {
        while (buy_day < days - 1 && prices[buy_day + 1] <= prices[buy_day]) {
            buy_day++;
        }

        sell_day = buy_day;
        while (sell_day < days - 1 && prices[sell_day + 1] >= prices[sell_day]) {
            sell_day++;
        }

        profit += prices[sell_day] = prices[buy_day];
        buy_day = sell_day + 1;

}

return profit
;
