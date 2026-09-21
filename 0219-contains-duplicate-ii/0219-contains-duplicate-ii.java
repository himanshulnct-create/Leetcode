class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int j = 0;j <nums.length;j++) {

            if (set.contains(nums[j])) {
                return true;
            }

            set.add(nums[j]);

            if (j - i + 1 > k) {
                set.remove(nums[i]);
                i++;
            }
        }

        return false;
    }
}