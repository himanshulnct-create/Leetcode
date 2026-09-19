class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        if (k <= 0 || nums.length < k) return 0;

        long sum = 0;
        long max = 0;

        int left = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0;right <nums.length;right++) {
            sum += nums[right];
            map.put(
                nums[right],
                map.getOrDefault(nums[right], 0) + 1
            );

            if (right - left + 1 == k) {

                if (map.size() == k) {
                    max = Math.max(max, sum);
                }
                map.put(
                    nums[left],
                    map.get(nums[left]) - 1
                );

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                sum -= nums[left];
                left++;
            }
        }

        return max;
    }
}
