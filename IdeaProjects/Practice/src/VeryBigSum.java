import java.io.*;
import java.math.*;

public class VeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for (long i : ar){
            sum +=i;
        }
        return sum;
    }



    public static void main(String[] args) {
        long[] nums = {100000001, 100000002, 100000003, 100000004, 100000005};
        long i = aVeryBigSum(nums);
        System.out.println(i);

    }

}
