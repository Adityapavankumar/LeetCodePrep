class Solution {
    public int lengthOfLastWord(String s) {
        int endIndex = s.length() - 1;
        while(endIndex >= 0 && s.charAt(endIndex)==' '){
            endIndex--; // remove any trailing spaces
        }
        int startIndex = endIndex;
        while(startIndex >=0 && s.charAt(startIndex)!=' '){
            startIndex--; // remove non spaces and trace back start of final word
        }
        return endIndex-startIndex;
    }
}