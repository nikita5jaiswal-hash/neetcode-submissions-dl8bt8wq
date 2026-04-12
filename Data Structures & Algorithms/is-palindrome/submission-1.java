class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        int length = s.length();
        int start =0;
        int end = length-1;

        while(start<end) {
            while(start < end && !Character.isLetterOrDigit(charArray[start])) {
                start++;
            }
            while(start < end && !Character.isLetterOrDigit(charArray[end])) {
                end--;
            }
            if(charArray[start] != charArray[end]) {
                return false;
            }  
            start++;
            end--;
        }
        return true;
    }
}
