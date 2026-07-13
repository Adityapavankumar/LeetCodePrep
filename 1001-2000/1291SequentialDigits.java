class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();

        for(int startDigit = 1; startDigit < 9; ++startDigit){
            int currentNum = startDigit;
            for(int nextDigit = startDigit+1; nextDigit < 10; ++nextDigit){
                currentNum = currentNum*10 + nextDigit;
                if(currentNum >= low && currentNum <= high){
                    result.add(currentNum);
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}