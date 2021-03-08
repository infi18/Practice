/*
 * The program finds a unique number (occurs only once) from the list of numbers in a given array
 * */

import java.util.Map;
import java.util.HashMap;

public class UniqueNumber {

      static class Solution {
        public int uniqNum(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            for (int i : nums) {
               if(map.get(i) == 1){
                   return i;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 3, 2};

        Solution myObj = new Solution();
        int ans = myObj.uniqNum(nums);
            System.out.println(ans);
    }
}
