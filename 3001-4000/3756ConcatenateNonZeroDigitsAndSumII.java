class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int[] result = new int[queries.length]; // result to be of same length as queries
        int MOD = 1_000_000_007;
        // iterate through queries
        for(int j=0; j<queries.length; j++){
            // find substring for each query
            String subString = s.substring(queries[j][0], queries[j][1] + 1);
            // initialize sum of digits and ans
            long sumOfDigits = 0;
            long ans = 0;
            // now iterate through substring
            for(int i=0; i<subString.length(); i++){
                // identify digit
                int digit = subString.charAt(i) - '0';
                // perform operations if non zero digit
                if(digit !=0){
                    sumOfDigits += digit;
                    ans = ((ans*10) + digit) % MOD;
                }
            }
            // store result in result array
            result[j] = (int)(((sumOfDigits%MOD) * (ans)) % MOD);
        }
        return result;
    }
}