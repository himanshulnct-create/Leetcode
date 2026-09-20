class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int n = nums.length;
        int left = 0,
            right = 0;
        int sum = 0;
        while(right<n){
            sum+=nums[right];
            while(sum>=target){
                minLen = Math.min(minLen,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}