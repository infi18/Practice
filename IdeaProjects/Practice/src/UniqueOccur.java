/*
* The program finds an integer with unique number of occurrences from a given array
*
* */


import java.util.*;

public class UniqueOccur {

    static class Solution {
        public boolean uniqOccr(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            Set<Integer> set = new HashSet<>(map.values());
            return set.size() == map.size();

        }

    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 3, 2, 2};

        Solution myObj = new Solution();
        boolean ans = myObj.uniqOccr(nums);
        System.out.println(ans);
    }
}
