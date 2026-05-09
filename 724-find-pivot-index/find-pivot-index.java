class Solution {
    public int pivotIndex(int[] nums) {

        for(int i = 0; i < nums.length; i++)
        {
            int Lsum = 0;
            int Rsum = 0;

            // left sum
            for(int j = 0; j < i; j++)
            {
                Lsum = Lsum + nums[j];
            }

            // right sum
            for(int j = i + 1; j < nums.length; j++)
            {
                Rsum = Rsum + nums[j];
            }

            if(Lsum == Rsum)
            {
                return i;
            }
        }

        return -1;
    }
}