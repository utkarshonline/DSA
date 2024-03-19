class Solution {
    public int maxSubArray(int[] nums) {
     
        int maxSum = nums[0];  // Initialize the maximum sum with the first element
        int currentSum = nums[0];  // Initialize the current sum with the first element

 
        for (int i = 1; i < nums.length; i++) {
       
            currentSum = Math.max(nums[i], currentSum + nums[i]);

         
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
