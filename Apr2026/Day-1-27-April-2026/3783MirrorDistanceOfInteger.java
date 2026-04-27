/*
    Find number of digits in the number n
    Reverse the number - let it be r
    subtract n from r and find absolute value (incase r-n is negative)
    return value
*/
class Solution {
    public int mirrorDistance(int n) {
        int original = n;  // n keeps changing so keep one variable for original value
        int reversed = 0;  // initiation always at 0

        /*
            n%10 will give last digit
            n/10 will remove last digit - because n is defined as int
            reversed*10 will always have 0 in end - to accomadate last digit taken from n
            Idea is to remove digits one by one in end from n and keep adding them to start
            End of this while loop - n will have all digits removed & reversed fully populated
         */
        while (n>0) {
            reversed = (reversed*10) + (n%10);
            n /= 10;
        }

        return Math.abs(original - reversed); // return absolute value of difference
    }
}