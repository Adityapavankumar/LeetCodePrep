class Solution {
    public int largestAltitude(int[] gain) {
        int high = 0; // lowest possible altitude
        int altitude = 0; // initially starts at 0
        for(int i=0;i<gain.length;i++){
            altitude += gain[i];
            if(altitude>=high){
                high = altitude;
            }
        }
        return high;
    }
}