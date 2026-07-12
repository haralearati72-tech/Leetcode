class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {

            if (list1.contains(nums1[i]))
                continue;

            boolean same = false;

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    same = true;
                    break;
                }
            }

            if (!same)
                list1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {

            if (list2.contains(nums2[i]))
                continue;

            boolean same = false;

            for (int j = 0; j < nums1.length; j++) {
                if (nums2[i] == nums1[j]) {
                    same = true;
                    break;
                }
            }

            if (!same)
                list2.add(nums2[i]);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);

        return ans;
    }
}