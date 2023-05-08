class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int big = Math.max(nums1.length, nums2.length);

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        
        Set<Integer> set1 = new HashSet<>();
            for (int num : nums1) { set1.add(num); }
        Set<Integer> set2 = new HashSet<>();
            for (int num : nums2) { set2.add(num); }

        for (int i = 0; i < big; i++) 
        {
            if (i < nums1.length && (!(set2.contains(nums1[i])) && !list.get(0).contains(nums1[i]))) {
                list.get(0).add(nums1[i]);
            }

            if (i < nums2.length && (!(set1.contains(nums2[i])) && !list.get(1).contains(nums2[i]))) {
                list.get(1).add(nums2[i]);
            }
        }

        return list;
    }
}