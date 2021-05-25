import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigSorting {

    public static List<String> bigSorting(List<String> unsorted) {
        // Write your code here
        String[] itemsArray = new String[unsorted.size()];
        Integer[] intArr = new Integer[unsorted.size()];
        itemsArray = unsorted.toArray(itemsArray);

        for(int i =0; i< unsorted.size(); i++){

            intArr[i] = Integer.parseInt(itemsArray[i]);
        }

        Arrays.sort(intArr);

        for(int j =0; j< unsorted.size(); j++){

            itemsArray[j] = String.valueOf(intArr[j]);
        }

        return Arrays.asList(itemsArray);
    }



    public static void main(String[] args) {

    }
}
