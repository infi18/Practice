import java.util.Arrays;

import static java.util.Arrays.*;

public class MergeArrays {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int mrg1 = m -1;
        int mrg2 = n -1;

        int mrg = mrg1 + mrg2 + 1;

        while((mrg1 >= 0)&& (mrg2 >= 0))
            nums1[mrg--] = (nums1[mrg1] < nums2[mrg2]) ? nums2[mrg2--] : nums1[mrg1--];

        System.arraycopy(nums2, 0, nums1, 0, mrg2+1);

        Arrays.sort(nums1);
        return nums1;
    }

    public static void main(String[] args) {

        int[] nums1 = {10, 9, 4, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int m = 3;
        int n = 3;
        int[] mergedArr = merge(nums1, m, nums2, n);
        for (int i : mergedArr) {
            System.out.println(i);
        }
    }
}
