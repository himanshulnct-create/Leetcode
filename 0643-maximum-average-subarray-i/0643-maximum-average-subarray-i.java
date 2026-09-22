class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        double sum = 0;
        double avg;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
            
        }
            avg = (sum/k);
            maxAvg = Math.max(maxAvg,avg);
            
        for(int i = k; i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            avg = (sum/k);
        maxAvg = Math.max(maxAvg,avg);
        
        }
        return maxAvg;
    }
}