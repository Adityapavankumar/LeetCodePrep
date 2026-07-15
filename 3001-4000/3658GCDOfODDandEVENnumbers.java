class Solution {
    public int gcdOfOddEvenSums(int n) {
        // first calculate sum of odd numbers and even numbers
        int sumOfOddNums = 0;
        int sumOfEvenNums = 0;
        for(int i=1; i <=n; i++){
            sumOfOddNums += (2*i)-1;
            sumOfEvenNums += (2*i);
        }
        return findGCD(sumOfOddNums, sumOfEvenNums);

    }

    public static int findGCD(int a, int b){
        if(b == 0){
            return a;
        }
        return findGCD(b, a%b);
    }
}