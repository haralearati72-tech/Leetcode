class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[] = new int [n];
        int b[] = new int[n];
        int ans[] = new int [nums.length];

        for(int j = 0; j<n; j++)
        {
              a [j] = nums[j]; 
        }
           
        
           for(int k = n; k<nums.length; k++)
          {
             b [k-n] = nums[k]; 
          }
        
        for(int i = 0; i<n; i++)
        {
             ans[2 * i] = a[i];
            ans[2 * i + 1] = b[i];
        }
       return ans;
    }
}