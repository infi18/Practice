public class MaxConsecutive {
    static class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int cons = 0;
            int max = 0;

            for (int i : nums){
                if(i == 1){
                    cons ++ ;

                    if (max < cons )
                        max = cons;
                }
                else{
                    cons = 0;
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1,0,1,1,0,1,1,1,0,1};
        Solution myObj = new Solution();
        System.out.println(myObj.findMaxConsecutiveOnes(nums));

    }
}
