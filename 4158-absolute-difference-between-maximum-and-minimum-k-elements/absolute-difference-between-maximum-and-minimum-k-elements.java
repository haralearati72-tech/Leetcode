class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int LargeS = 0;
        int SmallS = 0;
        int n = nums.length;

        for(int i = 0; i<k ;i++)
        {
            SmallS = SmallS + nums[i];
            LargeS  = LargeS+ nums [n - 1 - i];

        }

        return  Math.abs(LargeS - SmallS);
    }
}