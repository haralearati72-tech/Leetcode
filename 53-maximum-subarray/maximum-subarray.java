class Solution {
    public int maxSubArray(int[] nums) {
        
       int sum = nums[0];   //-2  // current running sum
        int max = nums[0]; //-2    // final answer
        
        for (int i = 1; i < nums.length; i++) {
            
            // decide: continue or start new
            if (sum + nums[i] > nums[i])// 5+2>7>2 ==> -1>1
             {
                sum = sum + nums[i];//4+2==>6
            } else {
                sum = nums[i];//1
            }
            
            // update maximum
            if (sum > max) {
                max = sum;//6
            }
        }
        
        return max; 
    }
}