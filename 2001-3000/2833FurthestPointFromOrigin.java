// keep a tracking variable for distance from origin
// when L => dis -= 1 (reduce one) and when R => dis += 1 (add one)
// when _, check dis in both cases if -1 or +1 and choose whichever is furthest
// return distance
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        // count all lefts, rights => whichever is dominant, add wildcards count to it
        int leftCount = countCharacter(moves, 'L');
        int rightCount = countCharacter(moves, 'R');
        int wildcardCount = countCharacter(moves, '_');

        return Math.abs(leftCount-rightCount) + wildcardCount;
    }

    private int countCharacter(String moves, char targetChar){
        int count = 0;
        for(int i=0; i<moves.length(); i++){
            count += (moves.charAt(i)==targetChar ? 1 : 0);
        }
        return count;
    }
}