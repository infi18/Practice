public class NumbersWithEvenDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums){
            int counter = 0;
            while(i > 0){
                i = i/10;
                counter ++   ;
            }
            if (counter % 2 == 0){
                count ++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        int[] nums = {10, 454355, 2, 11,  246, 8689, 9};
        System.out.println(findNumbers(nums));
    }
}
