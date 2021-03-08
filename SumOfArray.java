public class SumOfArray {
    static class Solution {
        public int[] runningSum(int[] nums) {
            int sum = 0;

            for (int i = 0; i < nums.length; i++) {

                sum = sum + nums[i];

                nums[i] = sum;
            }

            return nums;
        }
    }

    public static void main(String[] args) {

        int[] nums = {10, 7, 2, 30};

        Solution myObj = new Solution();
        int[] ans = myObj.runningSum(nums);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}


