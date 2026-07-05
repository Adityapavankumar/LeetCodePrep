class Solution {
    public int findClosest(int x, int y, int z) {
        // Just calculate difference between z,x & z,y
        int xDist = Math.abs(x-z);
        int yDist = Math.abs(y-z);
        // see which is minimum
        if(xDist<yDist){
            return 1;
        } else if (xDist>yDist){
            return 2;
        } else {
            return 0;
        }
    }
}