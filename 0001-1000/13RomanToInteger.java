class Solution {
    public int romanToInt(String s) {
        // create hasmap for romanValues
        String roman = "IVXLCDM";
        int[] romanValues = {1, 5, 10, 50, 100, 500, 1000};
        Map<Character, Integer> romanValueMap = new HashMap<>();
        for(int i=0; i<romanValues.length;i++){
            romanValueMap.put(roman.charAt(i), romanValues[i]);
        }

        // get length of the string
        int length = s.length();

        // add last character value to result
        int result = romanValueMap.get(s.charAt(length-1));

        // Now all other characters in s to be evaluated
        for(int i=0;i< length - 1; i++){
            int sign = (romanValueMap.get(s.charAt(i)) < romanValueMap.get(s.charAt(i+1)))? -1:1;
            result += sign * romanValueMap.get(s.charAt(i));
        }
        return result;
    }
}