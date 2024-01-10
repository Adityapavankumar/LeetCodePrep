object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        // create one hashmap to store the differences with current array
        var diffMap = scala.collection.mutable.HashMap.empty[Int, Int]

        // now iterate through the array and check if item is present in diffMap
        for(i <- 0 to (nums.length - 1)){
            if(diffMap.contains(nums(i))){
                return Array(diffMap(nums(i)), i)
            } else {
                diffMap += ((target-nums(i)) -> i)
            }
        }

        // throw argument if no solution found
        throw new IllegalArgumentException("No solution found")
    }
}
