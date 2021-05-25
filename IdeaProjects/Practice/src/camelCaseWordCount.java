//Counts the total numebr of words in a camel case sentence

import java.util.Scanner;

public class camelCaseWordCount {

    public static int camelcase(String s) {
        // Write your code here
        int count = 1;
        String upper = "(.*[A-Z].*)";
        for(char c : s.toCharArray()){
            if (Character.isUpperCase(c))
            {
                count ++;
            }
        }
        return count;
    }

    public static void main (String[] args){

//      String str = "helloWorld";
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a String in camel case format ex : helloWorld");
        String ipStr = myObj.nextLine();
        Integer result = camelcase(ipStr);
        System.out.println("The total words in given String are:" +result);
    }
}
