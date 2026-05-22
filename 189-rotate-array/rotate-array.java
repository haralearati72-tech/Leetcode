class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        int[] ans = new int[n];

        // Put elements in new position
        for(int i = 0; i < n; i++) {

            ans[(i + k) % n] = nums[i];
        }

        // Copy back to original array
        for(int i = 0; i < n; i++) {

            nums[i] = ans[i];
        }
    }
}