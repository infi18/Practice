import java.lang.String;

public class EquivalentStrings {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(word1 == null){
            return false;
        }
        String s1 = "";
        for (String n:word1)
            s1+= n;

        String s2 = "";
        for (String n:word2)
            s2+= n;

        return (s1.equals(s2));

    }

    public static void main(String[] args) {
        String[] word1 = {"b", "ca"};
        String[] word2 = {"bc", "a"};
        System.out.println(arrayStringsAreEqual(word1, word2));

    }
}
