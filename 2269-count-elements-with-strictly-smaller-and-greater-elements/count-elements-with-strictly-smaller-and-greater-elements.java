class Solution {
    public int countElements(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            boolean smaller = false;
            boolean greater = false;

            for(int j = 0; j<nums.length; j++)
            {
                if(nums[i] > nums[j] )
                {
                    smaller = true;
                }
                if( nums[i] < nums[j])
                {
                    greater = true;
                }
            }
            if(smaller && greater)
            {
                count++;
            }
        }
        return count;
    }
}