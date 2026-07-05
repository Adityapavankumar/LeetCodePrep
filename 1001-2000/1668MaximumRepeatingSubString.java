class Solution {
    public int maxRepeating(String sequence, String word) {
        // identify maximum possible length
        int maxPossibleRepeatLength = sequence.length() / word.length();

        // now check for word to be present
        for(int k=maxPossibleRepeatLength; k>0; k--){
            String repeatString = word.repeat(k); // this repeats the word k times
            if(sequence.contains(repeatString)){
                return k;
            }
        }
        return 0;
    }
}