class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] account:accounts){
            int accountBal = 0;
            for(int i=0; i<account.length;i++){
                accountBal += account[i];
            }
            max = Math.max(accountBal, max);
        }
        return max;
    }
}