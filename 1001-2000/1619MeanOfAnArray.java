class Solution {
    public double trimMean(int[] arr) {
        // first size of the array
        int arrSize = arr.length;

        // removable count - elements to be removed
        int remCount = (int) Math.round(arrSize*0.05);

        // sort the array
        Arrays.sort(arr);

        int startIndex = remCount;
        int endIndex = arrSize-remCount;

        int[] trimmedArray = Arrays.copyOfRange(arr, startIndex, endIndex);

        int sumOfElements = 0;
        for(int num:trimmedArray){
            sumOfElements += num;
        }

        double mean = (double) sumOfElements / trimmedArray.length;

        return mean;
    }
}