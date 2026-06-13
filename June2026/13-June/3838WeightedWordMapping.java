class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();

        for(String word:words){
            int sum = 0;
            for(char c:word.toCharArray()){
                sum += weights[c - 'a']; // to get character corresponding weight from weights array
            }
            sum = sum % 26;
            char mappedChar = (char)('z'-sum);
            result.append(mappedChar);
        }
        return result.toString();
    }
}