class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int smax = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
        }
        
             boolean flag = false;

        for (int i = 0; i < nums.length; i++) 
        {

            if (nums[i] == max && !flag)
            {
                flag = true;
                continue;
            }

            if (nums[i] > smax) 
            {
                smax = nums[i];
            }
        }
        return (max - 1) * (smax - 1);
        
    }
}