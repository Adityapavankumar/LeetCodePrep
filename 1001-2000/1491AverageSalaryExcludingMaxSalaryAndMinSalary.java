class Solution {
    public double average(int[] salary) {
        // iterate through all and find total sum, min, max
        // remove min and max from total sum
        // divide by total count - 2
        int arraySize = salary.length;
        double totalSum = 0;
        int minSalary = 1000000; // maximum of given constraints
        int maxSalary = 0; // less than minimum of given constraints
        for(int i=0;i<arraySize;i++){
            totalSum += salary[i];
            if(salary[i]>maxSalary){
                maxSalary = salary[i];
            }
            if(salary[i]<minSalary){
                minSalary = salary[i];
            }
        }
        return (totalSum - maxSalary - minSalary)/(arraySize-2);
    }
}