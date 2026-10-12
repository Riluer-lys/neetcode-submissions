class Solution {
    public boolean isPalindrome(String s) {
        
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {

            while (left < right && !isAlnum(s.charAt(left))) {
                left++;
            }

            while (left < right && !isAlnum(s.charAt(right))) {
                right--;
            }

            if ((Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public boolean isAlnum(char c) {
        return ('a' <= c && c <= 'z') 
            || ('A' <= c && c <= 'Z') 
            || ('0' <= c && c <= '9');
    }
}
