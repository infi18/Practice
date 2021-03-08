/*
 * The program finds and returns the index of the two numbers from a list of numbers in a given,
 * whose sum adds up to that of the target value given
 * */

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                   return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }

public static void main(String[] args) {

    int[] nums = {10, 7, 2, 11};
    int target = 9;
    Solution myObj = new Solution();
    int[] ans = myObj.twoSum(nums, target);
    for(int i : ans){
        System.out.println(i);
    }
}
}