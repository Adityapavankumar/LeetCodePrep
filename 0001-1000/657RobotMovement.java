class Solution {
    public boolean judgeCircle(String moves) {
        int[] position = {0,0};
        for(char move:moves.toCharArray()){
            if(move == 'U'){
                position[1] += 1;
            } else if(move == 'D'){
                position[1] -= 1;
            } else if(move == 'L'){
                position[0] -= 1;
            } else {
                position[0] += 1;
            }
        }
        if(position[0] == 0 && position[1] == 0){
            return true;
        } else {
            return false;
        }
    }
}