class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        boolean[] present = new boolean[nums.length + 1];

        // Mark numbers present
        for(int i = 0; i < nums.length; i++)
        {
            present[nums[i]] = true;
        }

        // Find missing numbers
        for(int i = 1; i <= nums.length; i++)
        {
            if(present[i] == false)
            {
                list.add(i);
            }
        }

        return list;
    }
}