class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
      if(k>arr.length) return 0;
      int left = 0;
      int right = 0;
      int sum = 0;
      int windows = 0;
      
      while(right<k){
        sum+=arr[right];
        right++;
      }
        
        if(sum>= k*threshold){
            windows++;
        }
        while(right<arr.length){
            sum+=arr[right];
            sum-=arr[left];
            
            if(sum>= k*threshold){
                windows++;
            }
            right++;
            left++;
        }
        return windows;
    }
}