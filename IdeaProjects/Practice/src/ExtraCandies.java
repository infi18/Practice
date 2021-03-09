public class ExtraCandies {
    static class Solution {
        public String[] kidsWithCandies(int[] candies, int extraCandies) {

            int max = 0;
            String[] result = new String[candies.length];
            for (int i : candies){
                if (i > max)
                    max = i;
            }

            for (int j=0; j<candies.length; j++){

                if(candies[j] + extraCandies >= max){
                    result[j] = "True";
                }
                else {
                    result[j] = "False";
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {

        int[] candies = {1, 3, 2, 5, 2, 1};
        int extraCandies = 3;
        Solution myObj = new Solution();
        String[] ans = myObj.kidsWithCandies(candies, extraCandies);
        for(String i : ans){
            System.out.println(i);
        }
    }
}
