public class RichestCustomer {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int account : customer)
                wealth += account;
            max = Math.max(max, wealth);
        }
        return max;
    }

    public static void main(String[] args) {

        int[][] account = {{1,2,3}, {4,5,6}, {1,3,4}};
        int max = maximumWealth(account);
        System.out.println(max);


    }
}
