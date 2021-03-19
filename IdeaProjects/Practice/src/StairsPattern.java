import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StairsPattern {

    // Complete the staircase function below.
    static void staircase(int n) {

        char[] stairs = new char[n];
        Arrays.fill(stairs, ' ');
        for(int i = 1; i<= n; i++){
            stairs[n - i] = '#';

            System.out.println(stairs);
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 5;

        staircase(n);


    }
}
