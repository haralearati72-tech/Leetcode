class Solution {
    public int alternatingSum(int[] nums) {
        int Esum = 0;
        int osum = 0;
        int sub = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if(i%2 == 0)
            {
                Esum = Esum + nums[i];
            }
            else
            {
                 osum = osum + nums[i];
            }
        }
        return Esum - osum;
    }
}