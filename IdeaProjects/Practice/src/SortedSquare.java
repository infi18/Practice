import java.util.Arrays;

public class SortedSquare {
    public static int[] sortedSquares(int[] nums) {

        for (int i = 0 ; i < nums.length; i++){

            nums[i] *= nums[i];

        }

        Arrays.sort(nums);
        return nums;

    }

    public static void main(String[] args) {

        int[] nums = {10, -9, 4, -12, 5};
        int[] num2 = sortedSquares(nums);
        for(int i : num2){
            System.out.println(i);
        }
    }
}
