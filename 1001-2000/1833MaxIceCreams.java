class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int barsBought = 0;
        Arrays.sort(costs);
        for(int i=0;i< costs.length;i++){
            if(coins>=costs[i]){
                barsBought += 1;
                coins -= costs[i];
            } else {
                break;
            }
        }
        return barsBought;
    }
}