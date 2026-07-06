class Solution {
    public int dominantIndex(int[] nums) {

        int max = nums[0];
        int index = 0;

        // Find maximum element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        // Check the condition
        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }

        return index;
    }
}