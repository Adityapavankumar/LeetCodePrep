class Solution {
    public boolean isPalindrome(String s) {
        // create pointers
        int left = 0;
        int right = s.length() - 1;

        // loop through string
        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;
            }
            if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}