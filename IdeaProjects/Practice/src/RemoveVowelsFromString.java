public class RemoveVowelsFromString {

    public static String removeVowels(String s) {
        //String newString = s.replaceAll("[a, e, i, o, u]","");

        //return newString;

        int length = s.length();
        char[] ch = new char[length];
        int i = 0;

        for(char c : s.toCharArray()){

            if((c != 'a') && (c != 'e')
                    && (c != 'i')&& (c != 'o')
                    && (c != 'u'))

                ch[i++] = c;

        }

        return new String(ch, 0, i);
    }

    public static void main(String[] args) {

        String s = "Welcome to Coding";
        String res = removeVowels(s);
        System.out.println(res);

    }
}
