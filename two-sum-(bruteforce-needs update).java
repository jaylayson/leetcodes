class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for(int i = 0; i < nums.length; i++){            
            for(int j = 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){//if the 2 unique index values add up to target
                    results[0] = i;
                    results[1] = j;
                    return results;
                }//end of if
            }//end of 2nd for-loop

        }//end of 1st for-loop
    throw new IllegalArgumentException("No solution");
    }//end of twoSum
}