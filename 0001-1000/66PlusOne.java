class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length; // length of array
        // traverse array right to left
        for(int i=len-1;i>=0;i--){
            digits[i]++; // increment digit on right most

            digits[i] = digits[i]%10; // lets say digit is 9, then it becomes 10, have to make it 0
            if(digits[i]!=0){
                return digits;
            } // else just continue loop carrying 1
        }

        // if loop ends, it means all digits are 9, hence kept carrying 1 till the end
        int[] result = new int[len+1]; // create result array 1 size greater than digits
        result[0] = 1; // since all subsequent elements are 0, first element would be 1
        return result;
    }
}