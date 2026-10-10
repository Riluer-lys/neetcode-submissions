class Solution {
    public boolean isPalindrome(String s) {
        String newStr = "";
        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){
                newStr += String.valueOf(c).toLowerCase();
            }
        }

        String reversed = new StringBuilder(newStr).reverse().toString();
        return newStr.equals(reversed);


    }
}
