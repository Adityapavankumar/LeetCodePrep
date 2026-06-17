class Solution {
    public String longestCommonPrefix(String[] strs) {
        // check for common prefix from first element with all remaining elements
        for(int i=0;i < strs[0].length();i++){
            for(int j=1; j<strs.length; j++){
                // check for string less than first string or first mismatch
                if(strs[j].length()<=i || strs[j].charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}