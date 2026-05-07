class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
    
        for (int i = 0; i < n; i++)
        {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
        return nums1; 
    }
}

  /* int f=0,s=0;
        for(int i=0;i<n;i++)
        {
            if(nums1[f]<=nums2[s] )
            {
                c[i]=nums1[f];
                f++;
            }
            else if(nums1[f] == nums2[s])
            {
                c[i] = nums2[s];
            }
            else
            {
                c[i]=nums2[s];
                s++;
            }
        }*/