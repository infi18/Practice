public class StringMultiplication {
    static class Solution {
        public String multiply(String num1, String num2) {

            int prod = Integer.parseInt(num1) * Integer.parseInt(num2);

            String mult = Integer.toString(prod);

            return mult;
        }
    }

    public static void main(String[] args) {

        String num1 = "123456789";
        String num2 = "987654321";

        Solution myObj = new Solution();
        System.out.println(myObj.multiply(num1, num2));

    }
}
