class Solution {
    public int longestPalindrome(String s) {
        // create a hashmap for all characters
        Map<Character, Integer> charCount = new HashMap<>();

        // populating hash map
        for(char ch: s.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
        }

        // now iterate through hashmap values
        int maxLength = 0;
        boolean hasOdd = false;
        for(int value:charCount.values()){
            if(value%2 == 0){
                maxLength += value;
            } else {
                maxLength += value - 1;
                hasOdd = true;
            }
        }
        if(hasOdd){
            maxLength += 1; // can use odd occurence as center
        }
        return maxLength;

    }
}