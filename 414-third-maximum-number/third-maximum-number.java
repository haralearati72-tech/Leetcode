class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for(int i = 0;i<nums.length; i++)
        {
            if(max < nums[i])
            {
                max = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++)
        {
            if(max != nums[i] && nums[i] > smax)
            {
                smax = nums[i];
            }
        }
        for(int i = 0; i<nums.length; i++)
        {
            if(max != nums[i] && smax != nums[i] && tmax < nums[i])
            {
                tmax = nums[i];
            }
        }
        if(tmax == Long.MIN_VALUE)
        {
            return (int)max;
        }
        return  (int)tmax;
    }
}