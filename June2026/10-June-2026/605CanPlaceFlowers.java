class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int bedLength = flowerbed.length;

        for(int i=0;i<bedLength;i++){
            int leftNeighbour = (i == 0) ? 0:flowerbed[i-1];
            int rightNeighbour = (i == (bedLength-1)) ? 0:flowerbed[i+1];

            // check if no flowers in neighbourhood
            if(leftNeighbour + flowerbed[i] + rightNeighbour == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return n<=0;
    }
}