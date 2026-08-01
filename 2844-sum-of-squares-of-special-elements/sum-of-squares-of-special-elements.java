class Solution {
    public int sumOfSquares(int[] nums) {
   
        int sum = 0;
        for(int i = 0; i<nums.length; i++)
        {   int n = nums.length;
            if(n % (i+1) == 0)
            {
                int sqr = nums[i]*nums[i];
                sum = sum + sqr;
            }
        }
        return sum;
    }
}