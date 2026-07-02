class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // first create hashmap of counts
        Map<Integer, Integer> arrCountMap = new HashMap<>();
        for(int element:arr){
            arrCountMap.put(element, arrCountMap.getOrDefault(element, 0) + 1);
        }

        // collect only values
        List<Integer> frequencies =new ArrayList<>(arrCountMap.values());

        // now sort these frequencies
        Collections.sort(frequencies);

        int uniqueIntegerCount = frequencies.size();

        for(int i=0; i<uniqueIntegerCount; i++){
            k -= frequencies.get(i);
            if(k<0){
                return uniqueIntegerCount - i;
            }
        }
        return 0;

    }
}