import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minMaxSumArray {

        // Complete the miniMaxSum function below.
        static void miniMaxSum(int[] arr) {

            Arrays.sort(arr);
            long min = 0;
            long max = 0;
            for (int i = 1; i < arr.length; i++) {
                max += arr[i];
            }
            for (int j = 0; j < (arr.length - 1); j++) {
                min += arr[j];
            }
            System.out.print(min + " " + max);

        }


    public static void main(String[] args) {

            int[] arr = {1, 5, 6, 6, 8, 9};
            miniMaxSum(arr);

    }

}
