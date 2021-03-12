public class BuySellStock {

    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int max = 0;


        for(int i = 0; i< prices.length; i++){

            if(min > prices[i])
                min = prices[i];

            else if (prices[i] - min > max)
                max = prices[i] - min ;

        }

        return max;
    }

    public static void main (String[] args){

        int[] price = {7,1,5,3,6,4};
        int profit = maxProfit(price);
        System.out.println(profit);
    }
}
