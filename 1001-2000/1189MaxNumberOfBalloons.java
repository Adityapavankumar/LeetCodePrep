class Solution {
    public int maxNumberOfBalloons(String text) {
        // create a hashmap of number of instances of character in the given string
        Map<Character, Integer> charCount = new HashMap<>();

        // hashmap for all characters in the String
        for(char ch: text.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // To find maximum number of text instances of "balloon"
        // first reduce count of 'l' and 'o' by 2 since they appear twice
        charCount.put('l', charCount.getOrDefault('l',0)/2);
        charCount.put('o', charCount.getOrDefault('o',0)/2);

        // now just count for minimum amongst 'baloon'
        int maxBalloon = text.length();
        for(char c: "balon".toCharArray()){
            maxBalloon = Math.min(maxBalloon, charCount.getOrDefault(c, 0));
        }
        return maxBalloon;
    }
}