public class DefaningIP {

    static class Solution {
        public String defangIPaddr(String address) {

          String  MyStr = address.replace("." , "[.]");
            return MyStr;
        }
    }

    public static void main(String[] args) {

        String newAddr = "192.168.1.1";

       Solution myObj = new Solution();
       System.out.println(myObj.defangIPaddr(newAddr));

    }
}
