public class ShuffleArray {

    static class Solution {
        public int[] shuffle(int[] nums, int n) {

            int[] shuffle = new int[2*n];
            for(int i = 0; i < n; i++){
                shuffle[2 * i] = nums[i];
                shuffle[2 * i + 1] = nums[n+i];
            }
            return shuffle;
        }
    }

    public static void main(String[] args) {

        int[] nums = {10, 7, 2, 11, 2, 6, 8, 9};
        int target = 4;
        Solution myObj = new Solution();
        int[] ans = myObj.shuffle(nums, target);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
