public class Convert_to_Lower_and_Upper_Case {
    public static String toLowerCase(String str) {

        char[] ch = str.toCharArray();

        for (int i = 0; i< ch.length; i++){

            if (ch[i] >= 'A' && ch[i]<='Z')
                ch[i] +=32;
        }

        return String.valueOf(ch);
    }

    public static String toUpperCase(String str) {

        char[] ch = str.toCharArray();

        for (int i = 0; i< ch.length; i++){

            if (ch[i] >= 'a' && ch[i]<='z')
                ch[i] -=32;
        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {

        String str = "LoveHTH";
        System.out.println(toLowerCase(str));
        System.out.println(toUpperCase(str));


    }
}
