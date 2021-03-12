//Returns the index of
// max number which is at least twice the size of all numbers present in an array
// if  a number isn't found returns zero

public class MaxNumber {
    public static int dominantIndex(int[] nums) {

        int max = 0, counter = 0;
        int index = 0;
        int length = nums.length;

        for(int i = 0; i < length; i++){
            if(max < nums[i]){
                max = nums[i];
                index = i;
            }
        }

        for (int j : nums){
            if (max >= 2 * j){
                counter ++;
            }
        }
        if (counter == length - 1)
            return index;

        else
            return -1;

    }
}
