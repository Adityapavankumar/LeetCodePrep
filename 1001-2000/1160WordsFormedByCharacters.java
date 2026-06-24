// Solution 1
class Solution {
    public int countCharacters(String[] words, String chars) {
        // create hash map for character count in chars string
        Map<Character, Integer> charCount = new HashMap <>();
        for(char ch: chars.toCharArray()){
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        int result = 0;

        for(String word: words){
            // for each word, get character count
            Map<Character, Integer> wordCharCount = new HashMap <>();
            for(char ch: word.toCharArray()){
                wordCharCount.put(ch, wordCharCount.getOrDefault(ch, 0) + 1);
            }
            int tempCounter = 0;
            for(char ch: wordCharCount.keySet()){
                if(wordCharCount.get(ch) <= charCount.getOrDefault(ch, 0)){
                    tempCounter += wordCharCount.get(ch);
                } else {
                    // even if one doesn't match, reset
                    tempCounter = 0;
                    break;
                }
            }
            result += tempCounter;
        }
        return result;
    }
}

// Solution 2
