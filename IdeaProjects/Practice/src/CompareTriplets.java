/*  Alice and Bob each created one problem for HackerRank.
*   A reviewer rates the two challenges, awarding points on a scale from to for
*   three categories: problem clarity, originality, and difficulty.
*   We define the rating for Alice's challenge to be the triplet challenge to be the triplet .
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class CompareTriplets {


    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

            int countA = ((a.get(0) > b.get(0) ? 1 : 0) +
                    (a.get(1) > b.get(1) ? 1 : 0) +
                    (a.get(2) > b.get(2) ? 1 : 0));
            int countB = ((a.get(0) < b.get(0) ? 1 : 0) +
                    (a.get(1) < b.get(1) ? 1 : 0) +
                    (a.get(2) < b.get(2) ? 1 : 0));

            List<Integer> res = new ArrayList<>();
            res.add(countA);
            res.add(countB);

            return res;
        }


        public static void main(String[] args) {

        Integer[] alice = {15, 78, 90};
        Integer[] bob =   {15, 65, 91};


        List<Integer> a = new ArrayList<>(Arrays.asList(alice));
        List<Integer> b = new ArrayList<>(Arrays.asList(bob));

        List<Integer> result = compareTriplets(a, b);

        for(int i : result){
            System.out.println(i);
        }

        }


}
